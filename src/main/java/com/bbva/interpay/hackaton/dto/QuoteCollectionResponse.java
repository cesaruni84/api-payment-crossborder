/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author P019956
 *
 */
public class QuoteCollectionResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("quote_collection_id")
	private String quote_collection_id;
	
	@JsonProperty("quotes")
	private List<Quote> quotes;

	public void setQuoteCollectionId(String quoteCollectionId) {
		this.quote_collection_id = quoteCollectionId;
	}
	
	public String getQuoteCollectionId() {
		return this.quote_collection_id;
	}

	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}
	
	public List<Quote> getQuotes() {
		return this.quotes;
	}

}
