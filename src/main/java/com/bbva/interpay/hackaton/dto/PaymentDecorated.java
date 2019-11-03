/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author P019956
 *
 */
public class PaymentDecorated implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//First level
	private String idTransfer;
	private String dateMovimient;
	private String stateMovimient;
	private Double amountEquivalent;

	//Second level
	private String beneficiary;
	private String numberAccountBeneficiary;
	private String referenceBeneficiary;
	private String currencyBeneficiary;
	private Double rate;
	private Double amountComision;
	private Double amountTransfer;
	private String currencyCode;
	
	public PaymentDecorated() {
		super();
	}

	public String getIdTransfer() {
		return idTransfer;
	}

	public void setIdTransfer(String idTransfer) {
		this.idTransfer = idTransfer;
	}

	public String getDateMovimient() {
		return dateMovimient;
	}

	public void setDateMovimient(String dateMovimient) {
		this.dateMovimient = dateMovimient;
	}

	public String getStateMovimient() {
		return stateMovimient;
	}

	public void setStateMovimient(String stateMovimient) {
		this.stateMovimient = stateMovimient;
	}

	public Double getAmountEquivalent() {
		return amountEquivalent;
	}

	public void setAmountEquivalent(Double amountEquivalent) {
		this.amountEquivalent = amountEquivalent;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getNumberAccountBeneficiary() {
		return numberAccountBeneficiary;
	}

	public void setNumberAccountBeneficiary(String numberAccountBeneficiary) {
		this.numberAccountBeneficiary = numberAccountBeneficiary;
	}

	public String getReferenceBeneficiary() {
		return referenceBeneficiary;
	}

	public void setReferenceBeneficiary(String referenceBeneficiary) {
		this.referenceBeneficiary = referenceBeneficiary;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getAmountComision() {
		return amountComision;
	}

	public void setAmountComision(Double amountComision) {
		this.amountComision = amountComision;
	}

	public Double getAmountTransfer() {
		return amountTransfer;
	}

	public void setAmountTransfer(Double amountTransfer) {
		this.amountTransfer = amountTransfer;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyBeneficiary() {
		return currencyBeneficiary;
	}

	public void setCurrencyBeneficiary(String currencyBeneficiary) {
		this.currencyBeneficiary = currencyBeneficiary;
	}

	
}
