/**
 * 
 */
package com.bbva.interpay.hackaton.util;

/**
 * @author P019956
 *
 */
public class Constantes {
	
	public static final String URL_GET_TOKEN_ORIGINATOR = "https://bbva01.xctest.i.ripple.com/oauth/token";
	public static final String URL_GET_TOKEN_BENEFICIARY = "https://bbva02.xctest.i.ripple.com/oauth/token";
	public static final String URL_RIPPLE_ORI_QUOTE = "https://bbva01.xctest.i.ripple.com/v4/quote_collections/";
	public static final String URL_RIPPLE_ORI_ACCEPT_QUOTE = "https://bbva01.xctest.i.ripple.com/v4/payments/accept";
	public static final String URL_RIPPLE_ORI_PAYMENT_ACCEPT = "https://bbva01.xctest.i.ripple.com/v4/payments";
	public static final String URL_GET_PAYMENTS_COMPLETED_BENEFICIARY = "https://bbva02.xctest.i.ripple.com/v4/payments?connector_role=RECEIVING&state=COMPLETED";
	public static final String URL_POST_SERVICE_BENEFICIARY  = "https://bbva02.xctest.i.ripple.com/v4";
	public static final String USER_API_RIPPLE = "super_user_client" ;
	public static final String USER_ACCS_RIPPLE  = "secret";
	public static final String URL_SOURCE_JSON  = "D:\\\\requestVisanetP2P.json";
	public static final String SENDING_ADDRESS  = "trans1_pen_bbva01@dev.esp.bbva01";
	public static final String RECEINVING_ADDRESS  = "trans_usd_bbva02@dev.esp.bbva02";
	public static final String QUOTE_TYPE  = "SENDER_AMOUNT";

	//URI DE SERVICIOS DEL API
	public static final String YUPI_URI_API_COMERCIOS  = "/v1/bbva/yupi/comercios";
	public static final String YUPI_URI_API_PERSONAS  = "/v1/bbva/yupi/personas";
	public static final String YUPI_URI_API_EVENTOS  = "/v1/bbva/yupi/eventos";
	public static final String YUPI_URI_API_PEDIDOS  = "/v1/bbva/yupi/comercios";
	public static final String YUPI_URI_ART_PEDIDOS  = "/v1/bbva/yupi/comercio2";
	
	// CONSTANTES FIJAS
	public static final String AUTHORIZADED  = "Authorization";
	public static final String TYPE_TOKEN  = "Bearer ";
	public static final String ACCEPT  = "Accept";


	private Constantes() {
		throw new IllegalStateException("Utility class");
	}


}
