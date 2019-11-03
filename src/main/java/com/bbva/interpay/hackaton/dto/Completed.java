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
public class Completed implements Serializable {
	
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<String> json;

    private String created_at;

    private String subState;

	public Completed() {
		super();
	}

	public List<String> getJson() {
		return json;
	}

	public void setJson(List<String> json) {
		this.json = json;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getSubState() {
		return subState;
	}

	public void setSubState(String subState) {
		this.subState = subState;
	}
    
    
    
    
}
