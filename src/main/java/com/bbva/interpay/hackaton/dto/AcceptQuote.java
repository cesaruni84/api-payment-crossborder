/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;

/**
 * @author P019956
 *
 */
public class AcceptQuote implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String quote_id;
	private String sender_end_to_end_id;
	private String internal_id;
	private UserInfo user_info;
	
	public AcceptQuote() {
		super();
	}

	public String getQuotId() {
		return quote_id;
	}

	public void setQuoteId(String quoteId) {
		this.quote_id = quoteId;
	}

	public String getSenderEndToEndId() {
		return sender_end_to_end_id;
	}

	public void setSenderEndToEndId(String senderEndToEndId) {
		this.sender_end_to_end_id = senderEndToEndId;
	}

	public String getInternalId() {
		return internal_id;
	}

	public void setInternalId(String internalId) {
		this.internal_id = internalId;
	}

	public UserInfo getUserInfo() {
		return user_info;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.user_info = userInfo;
	}
	
	


}
