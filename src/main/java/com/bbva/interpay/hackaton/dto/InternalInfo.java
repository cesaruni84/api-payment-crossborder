/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author P019956
 *
 */
public class InternalInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2284126380805498831L;
	/**
	 * 
	 */
	private String connector_role;
	private ArrayList<Object> labels;
	private String internal_id;

	
	public InternalInfo() {
		super();
	}


	public String getConnector_role() {
		return connector_role;
	}

	public void setConnector_role(String connector_role) {
		this.connector_role = connector_role;
	}

	public ArrayList<Object> getLabels() {
		return labels;
	}

	public void setLabels(ArrayList<Object> labels) {
		this.labels = labels;
	}

	public String getInternal_id() {
		return internal_id;
	}

	public void setInternal_id(String internal_id) {
		this.internal_id = internal_id;
	}


}
