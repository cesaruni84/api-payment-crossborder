/**
 * 
 */
package com.bbva.interpay.hackaton.controller;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.validation.Valid;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bbva.interpay.hackaton.dto.Content;
import com.bbva.interpay.hackaton.dto.Payment;
import com.bbva.interpay.hackaton.dto.PaymentDecorated;
import com.bbva.interpay.hackaton.dto.PaymentList;
import com.bbva.interpay.hackaton.dto.PaymentResponse;
import com.bbva.interpay.hackaton.dto.Quote;
import com.bbva.interpay.hackaton.dto.QuoteCollectionResponse;
import com.bbva.interpay.hackaton.dto.QuoteElement;
import com.bbva.interpay.hackaton.dto.TransactionLog;
import com.bbva.interpay.hackaton.security.AccessTokenObject;
import com.bbva.interpay.hackaton.util.Constantes;
import com.bbva.interpay.hackaton.util.Utilitario;

/**
 * @author P019956
 *
 */

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AuthorizerInterPaymentBeneficiary {

	Logger logger = (Logger) LoggerFactory.getLogger(AuthorizerInterPaymentController.class);
	
	@GetMapping(value = "bbva02/interpay/auth", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccessTokenObject> getAuthTokenBackendOriginator() {

		try {
			// Api Security RIPPLE
			AccessTokenObject accessToken = invokeServiceAuthBackendBeneficiary();
			ResponseEntity <AccessTokenObject>entity = new ResponseEntity<AccessTokenObject> (accessToken,HttpStatus.OK);	
			return entity;
		} catch (Exception e) {
			return null;
		}

	}
	
	@PostMapping(value = "bbva02/interpay/quote", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> acceptQuote(@RequestHeader(name = "token-auth", required = true) String tokenAuth,
										@Valid @RequestBody TransactionLog transaction) throws URISyntaxException 
	{
		JSONObject jsonObject = new JSONObject();
		RestTemplate restTemplate = new RestTemplate();
		
		// Completando cabeceras
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer " + tokenAuth );
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());
		
		// Body
		jsonObject.put("sending_address", Constantes.SENDING_ADDRESS);
		jsonObject.put("receiving_address", Constantes.RECEINVING_ADDRESS);
		jsonObject.put("amount", transaction.getAmountOrigin());
		jsonObject.put("currency", transaction.getMoneyAccountOrigin());
		jsonObject.put("quote_type", Constantes.QUOTE_TYPE);

		HttpEntity<Object> entity = new HttpEntity<Object>(jsonObject.toString(), headers);
		ResponseEntity<Object> responseEntity2 = restTemplate.exchange(Constantes.URL_RIPPLE_ORI_QUOTE,HttpMethod.POST, entity, Object.class);

		if (responseEntity2.getStatusCode() == HttpStatus.OK) {
			return responseEntity2;
		}

		return null;
		
	}
	
	
	@PostMapping(value = "bbva02/payment-cross/simulate", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TransactionLog> simulatePaymentInternational(@RequestBody TransactionLog transaction) throws URISyntaxException 
	{
		JSONObject jsonObject = new JSONObject();
		AccessTokenObject accessToken = invokeServiceAuthBackendBeneficiary();
		ResponseEntity<TransactionLog> entityResp = null;

		// Header
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set(Constantes.AUTHORIZADED, Constantes.TYPE_TOKEN  + accessToken.getAccessToken() );
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add(Constantes.ACCEPT, MediaType.APPLICATION_JSON.toString());
		
		// Body
		jsonObject.put("sending_address", Constantes.SENDING_ADDRESS);
		jsonObject.put("receiving_address", Constantes.RECEINVING_ADDRESS);
		jsonObject.put("amount", transaction.getAmountOrigin());
		jsonObject.put("currency", transaction.getMoneyAccountOrigin());
		jsonObject.put("quote_type", Constantes.QUOTE_TYPE);

		HttpEntity<?> entity = new HttpEntity<Object>(jsonObject.toString(), headers);
		ResponseEntity<QuoteCollectionResponse> responseEntity = restTemplate.exchange(Constantes.URL_RIPPLE_ORI_QUOTE,HttpMethod.POST, entity, QuoteCollectionResponse.class);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			QuoteCollectionResponse collection = responseEntity.getBody();
			List<Quote> listQuotes = collection.getQuotes();
			
			// Obtiene Quote Elements
			Quote quote = listQuotes.get(0);
			ArrayList<QuoteElement> listQuoteElements = quote.getQuoteElements();
			transaction.setIdQuoteExternal(quote.getQuoteId());

			// Obtiene tipo de cambio aplicado (Nodo 2)
			QuoteElement quoteElementForRateEx = listQuoteElements.get(1);
			transaction.setTypeRates(quoteElementForRateEx.getFxRate().getRate());
			transaction.setAmountBeneficiary(quoteElementForRateEx.getReceivingAmount());
			transaction.setMoneyAccountbeneficiary(quoteElementForRateEx.getReceivingCurrencyCode());
			transaction.setIdTransfer(Utilitario.generateRandomIntIntRange());
			
			// Obtiene comisiones aplicadas ( Nodo 3)
			QuoteElement quoteForFee = listQuoteElements.get(2);
			transaction.setAmountFee(quoteForFee.getReceivingFee());
			
			// Monto total a pagar en moneda original
			Double fee = quoteForFee.getReceivingFee().doubleValue();
			Double rate = quoteElementForRateEx.getFxRate().getRate().doubleValue();
			Double feeConvert  = fee / rate;
			Double amountEquivalent = transaction.getAmountOrigin() + feeConvert ;
			transaction.setAmountEquivalent(amountEquivalent);
			entityResp = new ResponseEntity<TransactionLog> (transaction,HttpStatus.OK);	
		}

		return entityResp;
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping(value = "bbva02/payment-cross/execute", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PaymentResponse> executePaymentInternational(@RequestBody TransactionLog transaction) 
	{
		Payment payment;
		JSONObject jsonObject = new JSONObject();
		PaymentResponse paymentResponse = new PaymentResponse();
		ResponseEntity response = null;
		AccessTokenObject accessToken = invokeServiceAuthBackendBeneficiary();

		// Header
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set(Constantes.AUTHORIZADED, Constantes.TYPE_TOKEN  + accessToken.getAccessToken() );
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add(Constantes.ACCEPT, MediaType.APPLICATION_JSON.toString());
		
		// Body
		jsonObject.put("quote_id", transaction.getIdQuoteExternal());
		jsonObject.put("sender_end_to_end_id", transaction.getReferenceOrigin());

		HttpEntity<?> entity = new HttpEntity<Object>(jsonObject.toString(), headers);
		ResponseEntity<Payment> responseEntity = restTemplate.exchange(Constantes.URL_RIPPLE_ORI_ACCEPT_QUOTE,HttpMethod.POST, entity, Payment.class);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			payment = responseEntity.getBody();
			paymentResponse.setPaymentId(payment.getPayment_id());
			paymentResponse.setPaymentState(payment.getPayment_state());
			response = new ResponseEntity<PaymentResponse> (paymentResponse,HttpStatus.OK);	

		} else {
			Object obj = responseEntity.getBody();
			response = new ResponseEntity<Object> (obj,HttpStatus.INTERNAL_SERVER_ERROR);	
		}

		return response;

	}
	
	@GetMapping(value = "bbva02/interpay/payments/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<?>> listPaymentsBeneficiary() {
		
		List <PaymentDecorated> listPayments = new ArrayList<>() ;
		try {
			// Api Security RIPPLE
			AccessTokenObject accessToken = invokeServiceAuthBackendBeneficiary();

			// Header
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + accessToken.getAccessToken() );
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.add("Accept", MediaType.APPLICATION_JSON.toString());


			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			ResponseEntity<PaymentList> responseEntity = restTemplate.exchange(Constantes.URL_GET_PAYMENTS_COMPLETED_BENEFICIARY,
					  HttpMethod.GET,
					  entity,
					  PaymentList.class);

			if (responseEntity.getStatusCode() == HttpStatus.OK) {
				List<Content> listContent = responseEntity.getBody().getContent();
				for (Content content : listContent) {
			        PaymentDecorated decorated = new PaymentDecorated();
					List<QuoteElement> listQuoteElements = content.getContract().getQuote().getQuoteElements();
					QuoteElement quoteElementForRateEx = listQuoteElements.get(1);
			        decorated.setRate(quoteElementForRateEx.getFxRate().getRate().doubleValue());
			        decorated.setAmountEquivalent(quoteElementForRateEx.getReceivingAmount().doubleValue());
			        decorated.setCurrencyBeneficiary(quoteElementForRateEx.getReceivingCurrencyCode());
			        decorated.setAmountTransfer(content.getContract().getQuote().getAmount().doubleValue());
			        decorated.setCurrencyCode(content.getContract().getQuote().getCurrencyCode());
			        
					QuoteElement quoteForFee = listQuoteElements.get(2);
			        decorated.setAmountComision(quoteForFee.getReceivingFee().doubleValue());
			   
			        decorated.setBeneficiary("MI ABUELITA DE ESPAÑA");
			        decorated.setNumberAccountBeneficiary("ES7921000813610123456789");
			        decorated.setDateMovimient(content.getModified_at());
			        decorated.setIdTransfer(content.getPayment_id());
			        decorated.setReferenceBeneficiary(content.getContract().getSender_end_to_end_id());
			        decorated.setStateMovimient(content.getPayment_state());
			        listPayments.add(decorated);
				}						
			}
			return new ResponseEntity<List<?>> (listPayments,HttpStatus.OK);	


		} catch (Exception e) {
			return new ResponseEntity<List<?>> (listPayments,HttpStatus.OK);	
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(value = "bbva02/payment-cross/settle", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PaymentResponse> settlePaymentInternational(@RequestBody Payment paymentReq) 
	{
		
		PaymentResponse paymentResponse = new PaymentResponse();
		AccessTokenObject accessToken = invokeServiceAuthBackendBeneficiary();
		String paymentId = paymentReq.getPayment_id();
		ResponseEntity response = null;

		// Header
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set(Constantes.AUTHORIZADED, Constantes.TYPE_TOKEN  + accessToken.getAccessToken() );
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add(Constantes.ACCEPT, MediaType.APPLICATION_JSON.toString());
		
		// URL
		HttpEntity<?> entity = new HttpEntity<Object>(headers);
		String url = Constantes.URL_RIPPLE_ORI_PAYMENT_ACCEPT + "/" + paymentId  + "/settle";
		ResponseEntity<Payment> responseEntity = restTemplate.exchange(url,HttpMethod.POST, entity, Payment.class);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			Payment payment = responseEntity.getBody();
			paymentResponse.setPaymentId(payment.getPayment_id());
			paymentResponse.setPaymentState(payment.getPayment_state());
			response = new ResponseEntity<PaymentResponse> (paymentResponse,HttpStatus.OK);	
		} else {
			Object obj = responseEntity.getBody();
			response = new ResponseEntity<Object> (obj, HttpStatus.INTERNAL_SERVER_ERROR);	
		}

		return response;	

	}
	
	
	@SuppressWarnings("unchecked")
	public AccessTokenObject invokeServiceAuthBackendBeneficiary() {
		AccessTokenObject accessToken = new AccessTokenObject();

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers = createHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
		LinkedHashMap<String, String> response = new LinkedHashMap<String, String>();
		body.add("grant_type", "client_credentials");
		
		HttpEntity<?> entity = new HttpEntity<Object>(body, headers);
		ResponseEntity<?> responseEntity = restTemplate.exchange(Constantes.URL_GET_TOKEN_BENEFICIARY,
				HttpMethod.POST, entity, Object.class);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			response = (LinkedHashMap<String, String>) responseEntity.getBody();
			accessToken.setAccessToken(response.get("access_token"));
			accessToken.setExpiresIn(response.get("expires_in"));
			accessToken.setJti(response.get("jti"));
			accessToken.setTokenType(response.get("token_type"));
			accessToken.setScope(response.get("scope"));
		}

		return accessToken;
	}

	private static final HttpHeaders createHeaders() {
		return new HttpHeaders() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			{
				String auth = Constantes.USER_API_RIPPLE + ":" + Constantes.USER_ACCS_RIPPLE;
				byte[] encodedAuth = org.apache.tomcat.util.codec.binary.Base64
						.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
	}
	


}
