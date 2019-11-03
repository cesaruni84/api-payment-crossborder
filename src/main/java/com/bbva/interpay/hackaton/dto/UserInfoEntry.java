/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;

/**
 * @author CESAR
 *
 */
public class UserInfoEntry implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object json;

    private String created_at;

    private String subState;

	public UserInfoEntry() {
		super();
	}

	public Object getJson() {
		return json;
	}

	public void setJson(Object json) {
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
