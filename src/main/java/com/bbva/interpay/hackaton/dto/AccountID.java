/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author P019956
 *
 */
public class AccountID implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -808600926363170447L;
	
	@JsonProperty("Ccy")
	private String  currency;
	
	@JsonProperty("Nm")
	private String  nameAccount;
	
	@JsonProperty("Id")
	private Account account;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getNameAccount() {
		return nameAccount;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	

}
