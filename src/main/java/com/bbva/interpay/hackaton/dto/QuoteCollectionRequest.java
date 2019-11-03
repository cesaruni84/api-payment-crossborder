/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author P019956
 *
 */
public class QuoteCollectionRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String sending_address;
	private String receiving_address;
	private BigDecimal amount;
	private String currency;
	private String quote_type;
	private String sender_or_receiver_currency;
	private BigDecimal custom_fee;
	private String payment_method;
	
	public QuoteCollectionRequest() {
		super();
	}
	public String getSendingAddress() {
		return sending_address;
	}
	public void setSendingAddress(String sendingAddress) {
		this.sending_address = sendingAddress;
	}
	public String getReceivingAddress() {
		return receiving_address;
	}
	public void setReceivingAddress(String receivingAddress) {
		this.receiving_address = receivingAddress;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getQuoteType() {
		return quote_type;
	}
	public void setQuoteType(String quoteType) {
		this.quote_type = quoteType;
	}
	public String getSenderOrReceiverCurrency() {
		return sender_or_receiver_currency;
	}
	public void setSenderOrReceiverCurrency(String senderOrReceiverCurrency) {
		this.sender_or_receiver_currency = senderOrReceiverCurrency;
	}
	public BigDecimal getCustomFee() {
		return custom_fee;
	}
	public void setCustomFee(BigDecimal customFee) {
		this.custom_fee = customFee;
	}
	public String getPaymentMethod() {
		return payment_method;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.payment_method = paymentMethod;
	}

}
