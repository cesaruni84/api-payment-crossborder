/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author P019956
 *
 */
public class ContentList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Payment> payments;
	 
    public ContentList() {
    	payments = new ArrayList<>();
    }

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

}
