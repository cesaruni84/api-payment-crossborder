package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author P019956
 *
 */
public class QuoteElement implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("quote_element_id")
	private String quote_element_id;
	
	@JsonProperty("quote_element_type")
	private String quote_element_type;
	
	@JsonProperty("quote_element_order")
	private Integer quote_element_order;
	
	@JsonProperty("sender_address")
	private String sender_address;
	
	@JsonProperty("receiver_address")
	private String receiver_address;
	
	@JsonProperty("sending_amount")
	private BigDecimal sending_amount;
	
	@JsonProperty("receiving_amount")
	private BigDecimal receiving_amount;
	
	@JsonProperty("sending_fee")
	private BigDecimal sending_fee;
	
	@JsonProperty("receiving_fee")
	private BigDecimal receiving_fee;
	
	@JsonProperty("sending_currency_code")
	private String sending_currency_code;
	
	@JsonProperty("receiving_currency_code")
	private String receiving_currency_code;
	
	@JsonProperty("fx_rate")
	private FxRate fx_rate;
	
	@JsonProperty("transfer_currency_code")
	private String transfer_currency_code;
	
	public QuoteElement() {
		super();
	}
	
	public String getQuoteElementId() {
		return quote_element_id;
	}
	public void setQuoteElementId(String quoteElementId) {
		this.quote_element_id = quoteElementId;
	}
	public String getQuoteElementType() {
		return quote_element_type;
	}
	public void setQuoteElementType(String quoteElementType) {
		this.quote_element_type = quoteElementType;
	}
	public Integer getQuoteElementOrder() {
		return quote_element_order;
	}
	public void setQuoteElementOrder(Integer quoteElementOrder) {
		this.quote_element_order = quoteElementOrder;
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
	public BigDecimal getSendingAmount() {
		return sending_amount;
	}
	public void setSendingAmount(BigDecimal sendingAmount) {
		this.sending_amount = sendingAmount;
	}
	public BigDecimal getReceivingAmount() {
		return receiving_amount;
	}
	public void setReceivingAmount(BigDecimal receivingAmount) {
		this.receiving_amount = receivingAmount;
	}
	public BigDecimal getSendingFee() {
		return sending_fee;
	}
	public void setSendingFee(BigDecimal sendingFee) {
		this.sending_fee = sendingFee;
	}
	public BigDecimal getReceivingFee() {
		return receiving_fee;
	}
	public void setReceivingFee(BigDecimal receivingFee) {
		this.receiving_fee = receivingFee;
	}
	public String getSendingCurrencyCode() {
		return sending_currency_code;
	}
	public void setSendingCurrencyCode(String sendingCurrencyCode) {
		this.sending_currency_code = sendingCurrencyCode;
	}
	public String getReceivingCurrencyCode() {
		return receiving_currency_code;
	}
	public void setReceivingCurrencyCode(String receivingCurrencyCode) {
		this.receiving_currency_code = receivingCurrencyCode;
	}
	public FxRate getFxRate() {
		return fx_rate;
	}
	public void setFxRate(FxRate fxRate) {
		this.fx_rate = fxRate;
	}
	public String getTransferCurrencyCode() {
		return transfer_currency_code;
	}
	public void setTransferCurrencyCode(String transferCurrencyCode) {
		this.transfer_currency_code = transferCurrencyCode;
	}



}
