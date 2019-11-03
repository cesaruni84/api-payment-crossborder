/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;

/**
 * @author P019956
 *
 */
public class PaymentResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String payment_id;
	private String payment_state;
	

	public PaymentResponse() {
		super();
	}
	public String getPaymentId() {
		return payment_id;
	}
	public void setPaymentId(String paymentId) {
		this.payment_id = paymentId;
	}
	public String getPaymentState() {
		return payment_state;
	}
	public void setPaymentState(String paymentState) {
		this.payment_state = paymentState;
	}
	
	
}
