/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;

/**
 * @author CESAR
 *
 */
public class ExecutionResults implements Serializable{
	
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String execution_result_id;

    private String execution_timestamp;

    private String execution_result_type;

    private String execution_result_order;

    private String sender_address;

    private String receiver_address;

    private String sending_amount;

    private String receiving_amount;

    private String sending_fee;

    private String receiving_fee;

    private String sending_currency_code;

    private String receiving_currency_code;

    private String fx_rate;

    private String transfer_currency_code;

    private String intermediary_delta;

    private String incentive_type;
    
	public ExecutionResults() {
		super();
	}

	public String getExecution_result_id() {
		return execution_result_id;
	}

	public void setExecution_result_id(String execution_result_id) {
		this.execution_result_id = execution_result_id;
	}

	public String getExecution_timestamp() {
		return execution_timestamp;
	}

	public void setExecution_timestamp(String execution_timestamp) {
		this.execution_timestamp = execution_timestamp;
	}

	public String getExecution_result_type() {
		return execution_result_type;
	}

	public void setExecution_result_type(String execution_result_type) {
		this.execution_result_type = execution_result_type;
	}

	public String getExecution_result_order() {
		return execution_result_order;
	}

	public void setExecution_result_order(String execution_result_order) {
		this.execution_result_order = execution_result_order;
	}

	public String getSender_address() {
		return sender_address;
	}

	public void setSender_address(String sender_address) {
		this.sender_address = sender_address;
	}

	public String getReceiver_address() {
		return receiver_address;
	}

	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}

	public String getSending_amount() {
		return sending_amount;
	}

	public void setSending_amount(String sending_amount) {
		this.sending_amount = sending_amount;
	}

	public String getReceiving_amount() {
		return receiving_amount;
	}

	public void setReceiving_amount(String receiving_amount) {
		this.receiving_amount = receiving_amount;
	}

	public String getSending_fee() {
		return sending_fee;
	}

	public void setSending_fee(String sending_fee) {
		this.sending_fee = sending_fee;
	}

	public String getReceiving_fee() {
		return receiving_fee;
	}

	public void setReceiving_fee(String receiving_fee) {
		this.receiving_fee = receiving_fee;
	}

	public String getSending_currency_code() {
		return sending_currency_code;
	}

	public void setSending_currency_code(String sending_currency_code) {
		this.sending_currency_code = sending_currency_code;
	}

	public String getReceiving_currency_code() {
		return receiving_currency_code;
	}

	public void setReceiving_currency_code(String receiving_currency_code) {
		this.receiving_currency_code = receiving_currency_code;
	}

	public String getFx_rate() {
		return fx_rate;
	}

	public void setFx_rate(String fx_rate) {
		this.fx_rate = fx_rate;
	}

	public String getTransfer_currency_code() {
		return transfer_currency_code;
	}

	public void setTransfer_currency_code(String transfer_currency_code) {
		this.transfer_currency_code = transfer_currency_code;
	}

	public String getIntermediary_delta() {
		return intermediary_delta;
	}

	public void setIntermediary_delta(String intermediary_delta) {
		this.intermediary_delta = intermediary_delta;
	}

	public String getIncentive_type() {
		return incentive_type;
	}

	public void setIncentive_type(String incentive_type) {
		this.incentive_type = incentive_type;
	}
	
	
    
    
}
