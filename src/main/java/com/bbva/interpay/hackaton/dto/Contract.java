/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;

/**
 * @author P019956
 *
 */
public class Contract implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String sender_end_to_end_id;
	private String created_at;
	private String expires_at;
	private Quote quote;
	
	public Contract() {
		super();
	}

	public String getSender_end_to_end_id() {
		return sender_end_to_end_id;
	}

	public void setSender_end_to_end_id(String sender_end_to_end_id) {
		this.sender_end_to_end_id = sender_end_to_end_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getExpires_at() {
		return expires_at;
	}

	public void setExpires_at(String expires_at) {
		this.expires_at = expires_at;
	}

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}

	
	
	

}
