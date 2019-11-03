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

public class TransactionLog implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Integer idTransfer;
	private String nameOrigin;
	private String numberAccountOrigin;
	private String moneyAccountOrigin;
	private double amountOrigin;
	private String referenceOrigin;
	private String dateCurrent;
	private BigDecimal typeRates;
	private Double amountEquivalent;
	private BigDecimal amountFee;
	private String nameBeneficiary;
	private String moneyAccountBeneficiary;
	private BigDecimal amountBeneficiary;
	private String referenceBeneficiary;
	private String numberAccountBeneficiary;
	private String idQuoteExternal;
	
	public TransactionLog() {
		super();
	}

	public Integer getIdTransfer() {
		return idTransfer;
	}

	public void setIdTransfer(Integer idTransfer) {
		this.idTransfer = idTransfer;
	}

	public String getNameOrigin() {
		return nameOrigin;
	}

	public void setNameOrigin(String nameOrigin) {
		this.nameOrigin = nameOrigin;
	}

	public String getNumberAccountOrigin() {
		return numberAccountOrigin;
	}

	public void setNumberAccountOrigin(String numberAccountOrigin) {
		this.numberAccountOrigin = numberAccountOrigin;
	}

	public String getMoneyAccountOrigin() {
		return moneyAccountOrigin;
	}

	public void setMoneyAccountOrigin(String moneyAccountOrigin) {
		this.moneyAccountOrigin = moneyAccountOrigin;
	}
	
	

	public double getAmountOrigin() {
		return amountOrigin;
	}

	public void setAmountOrigin(double amountOrigin) {
		this.amountOrigin = amountOrigin;
	}

	public String getReferenceOrigin() {
		return referenceOrigin;
	}

	public void setReferenceOrigin(String referenceOrigin) {
		this.referenceOrigin = referenceOrigin;
	}

	public String getDateCurrent() {
		return dateCurrent;
	}

	public void setDateCurrent(String dateCurrent) {
		this.dateCurrent = dateCurrent;
	}

	public BigDecimal getTypeRates() {
		return typeRates;
	}

	public void setTypeRates(BigDecimal typeRates) {
		this.typeRates = typeRates;
	}

	public double getAmountEquivalent() {
		return amountEquivalent;
	}


	public void setAmountEquivalent(Double amountEquivalent) {
		this.amountEquivalent = amountEquivalent;
	}


	public BigDecimal getAmountFee() {
		return amountFee;
	}

	public void setAmountFee(BigDecimal amountFee) {
		this.amountFee = amountFee;
	}

	public String getNameBeneficiary() {
		return nameBeneficiary;
	}

	public void setNameBeneficiary(String nameBeneficiary) {
		this.nameBeneficiary = nameBeneficiary;
	}

	public String getMoneyAccountbeneficiary() {
		return moneyAccountBeneficiary;
	}

	public void setMoneyAccountbeneficiary(String moneyAccountbeneficiary) {
		this.moneyAccountBeneficiary = moneyAccountbeneficiary;
	}

	public BigDecimal getAmountBeneficiary() {
		return amountBeneficiary;
	}

	public void setAmountBeneficiary(BigDecimal amountBeneficiary) {
		this.amountBeneficiary = amountBeneficiary;
	}

	public String getReferenceBeneficiary() {
		return referenceBeneficiary;
	}

	public void setReferenceBeneficiary(String referenceBeneficiary) {
		this.referenceBeneficiary = referenceBeneficiary;
	}

	public String getNumberAccountBeneficiary() {
		return numberAccountBeneficiary;
	}

	public void setNumberAccountBeneficiary(String numberAccountBeneficiary) {
		this.numberAccountBeneficiary = numberAccountBeneficiary;
	}

	public String getIdQuoteExternal() {
		return idQuoteExternal;
	}

	public void setIdQuoteExternal(String idQuoteExternal) {
		this.idQuoteExternal = idQuoteExternal;
	}
	
	
	
}
