/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author P019956
 *
 */
public class FxRate implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("rate")
	private BigDecimal rate;
	
	@JsonProperty("base_currency_code")
	private String base_currency_code;
	
	@JsonProperty("counter_currency_code")
	private String counter_currency_code;
	
	@JsonProperty("type")
	private String type;

	public FxRate() {
		super();
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getBase_currency_code() {
		return base_currency_code;
	}

	public void setBase_currency_code(String base_currency_code) {
		this.base_currency_code = base_currency_code;
	}

	public String getCounter_currency_code() {
		return counter_currency_code;
	}

	public void setCounter_currency_code(String counter_currency_code) {
		this.counter_currency_code = counter_currency_code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
