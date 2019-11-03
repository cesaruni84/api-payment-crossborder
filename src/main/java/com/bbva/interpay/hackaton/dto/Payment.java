/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author P019956
 *
 */
public class Payment implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String payment_id;
	private String contract_hash;
	private InternalInfo internal_info;
	private String payment_state;
	private Date modified_at;
	private Contract contract;
	private List<UserInfo> user_info;
	private List<String> ripplenet_info;
	private String execution_condition;
	private String crypto_transaction_id;
	private String validator;
	private String payment_type;
	private String returns_payment_with_id;
	private String returned_by_payment_with_id;
	private transient ArrayList<Object> execution_results;
	
	public Payment() {
		super();
	}

	public String getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}

	public String getContract_hash() {
		return contract_hash;
	}

	public void setContract_hash(String contract_hash) {
		this.contract_hash = contract_hash;
	}

	public InternalInfo getInternal_info() {
		return internal_info;
	}

	public void setInternal_info(InternalInfo internal_info) {
		this.internal_info = internal_info;
	}

	public String getPayment_state() {
		return payment_state;
	}

	public void setPayment_state(String payment_state) {
		this.payment_state = payment_state;
	}

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public List<UserInfo> getUser_info() {
		return user_info;
	}

	public void setUser_info(List<UserInfo> user_info) {
		this.user_info = user_info;
	}

	public List<String> getRipplenet_info() {
		return ripplenet_info;
	}

	public void setRipplenet_info(List<String> ripplenet_info) {
		this.ripplenet_info = ripplenet_info;
	}

	public String getExecution_condition() {
		return execution_condition;
	}

	public void setExecution_condition(String execution_condition) {
		this.execution_condition = execution_condition;
	}

	public String getCrypto_transaction_id() {
		return crypto_transaction_id;
	}

	public void setCrypto_transaction_id(String crypto_transaction_id) {
		this.crypto_transaction_id = crypto_transaction_id;
	}

	public String getValidator() {
		return validator;
	}

	public void setValidator(String validator) {
		this.validator = validator;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getReturns_payment_with_id() {
		return returns_payment_with_id;
	}

	public void setReturns_payment_with_id(String returns_payment_with_id) {
		this.returns_payment_with_id = returns_payment_with_id;
	}

	public String getReturned_by_payment_with_id() {
		return returned_by_payment_with_id;
	}

	public void setReturned_by_payment_with_id(String returned_by_payment_with_id) {
		this.returned_by_payment_with_id = returned_by_payment_with_id;
	}

	public ArrayList<Object> getExecution_results() {
		return execution_results;
	}

	public void setExecution_results(ArrayList<Object> execution_results) {
		this.execution_results = execution_results;
	}




}
