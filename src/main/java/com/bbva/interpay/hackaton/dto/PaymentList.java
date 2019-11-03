/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author CESAR
 *
 */
public class PaymentList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Content> content;

	private boolean last;

	private String totalPages;

	private String totalElements;

	private List<Sort> sort;

	private String numberOfElements;

	private boolean first;

	private String size;

	private String number;
	
	public PaymentList() {
		super();
	}

	public List<Content> getContent() {
		return content;
	}

	public void setContent(List<Content> content) {
		this.content = content;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public String getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}

	public String getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(String totalElements) {
		this.totalElements = totalElements;
	}

	public List<Sort> getSort() {
		return sort;
	}

	public void setSort(List<Sort> sort) {
		this.sort = sort;
	}

	public String getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(String numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public boolean isFirst() {
		return first;
	}

	public void setFirst(boolean first) {
		this.first = first;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
}
