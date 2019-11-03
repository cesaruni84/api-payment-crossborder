/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author P019956
 *
 */
public class Quote implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("quote_id")
	private String quote_id;
	
	@JsonProperty("created_at")
	private Date created_at;
	
	@JsonProperty("expires_at")
	private Date expires_at;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("price_guarantee")
	private String price_guarantee;
	
	@JsonProperty("sender_address")
	private String sender_address;
	
	@JsonProperty("receiver_address")
	private String receiver_address;
	
	@JsonProperty("amount")
	private BigDecimal amount;
	
	@JsonProperty("currency_code")
	private String currency_code;
	
	@JsonProperty("currency_code_filter")
	private String currency_code_filter;
	
	@JsonProperty("service_type")
	private String service_type;
	
	@JsonProperty("quote_elements")
	private ArrayList<QuoteElement> quote_elements;
	
	@JsonProperty("liquidity_warning")
	private String liquidity_warning;
	
	@JsonProperty("payment_method")
	private String payment_method;

	
	public Quote() {
		super();
	}

	public String getQuoteId() {
		return quote_id;
	}

	public void setQuoteId(String quoteId) {
		this.quote_id = quoteId;
	}

	public Date getCreatedAt() {
		return created_at;
	}

	public void setCreatedAt(Date createdAt) {
		this.created_at = createdAt;
	}

	public Date getExpiresAt() {
		return expires_at;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expires_at = expiresAt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPriceGuarantee() {
		return price_guarantee;
	}

	public void setPriceGuarantee(String priceGuarantee) {
		this.price_guarantee = priceGuarantee;
	}

	public String getSenderAddress() {
		return sender_address;
	}

	public void setSenderAddress(String senderAddress) {
		this.sender_address = senderAddress;
	}

	public String getReceiverAddress() {
		return receiver_address;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiver_address = receiverAddress;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrencyCode() {
		return currency_code;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currency_code = currencyCode;
	}

	public String getCurrencyCodeFilter() {
		return currency_code_filter;
	}

	public void setCurrencyCodeFilter(String currencyCodeFilter) {
		this.currency_code_filter = currencyCodeFilter;
	}

	public String getServiceType() {
		return service_type;
	}

	public void setServiceType(String serviceType) {
		this.service_type = serviceType;
	}

	public ArrayList<QuoteElement> getQuoteElements() {
		return quote_elements;
	}

	public void setQuoteElements(ArrayList<QuoteElement> quoteElements) {
		this.quote_elements = quoteElements;
	}

	public String getLiquidityWarning() {
		return liquidity_warning;
	}

	public void setLiquidityWarning(String liquidityWarning) {
		this.liquidity_warning = liquidityWarning;
	}

	public String getPaymentMethod() {
		return payment_method;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.payment_method = paymentMethod;
	}
	

}
