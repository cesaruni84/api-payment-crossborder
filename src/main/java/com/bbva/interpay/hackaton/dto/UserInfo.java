/**
 * 
 */
package com.bbva.interpay.hackaton.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author P019956
 *
 */
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String node_address;

	private List<UserInfoEntry> accepted;

	private List<UserInfoEntry> locked;

	private List<UserInfoEntry> lock_declined;

	private List<UserInfoEntry> retry_accept;

	private List<UserInfoEntry> retry_settlement;

	private List<UserInfoEntry> settlement;

	private List<UserInfoEntry> settlement_declined;

	private List<UserInfoEntry> failed;

	private List<UserInfoEntry> executed;

	private List<UserInfoEntry> completed;

	private List<UserInfoEntry> forwarded;

	private List<UserInfoEntry> returned;

	public UserInfo() {
		super();
	}

	public String getNode_address() {
		return node_address;
	}

	public void setNode_address(String node_address) {
		this.node_address = node_address;
	}

	public List<UserInfoEntry> getAccepted() {
		return accepted;
	}

	public void setAccepted(List<UserInfoEntry> accepted) {
		this.accepted = accepted;
	}

	public List<UserInfoEntry> getLocked() {
		return locked;
	}

	public void setLocked(List<UserInfoEntry> locked) {
		this.locked = locked;
	}

	public List<UserInfoEntry> getLock_declined() {
		return lock_declined;
	}

	public void setLock_declined(List<UserInfoEntry> lock_declined) {
		this.lock_declined = lock_declined;
	}

	public List<UserInfoEntry> getRetry_accept() {
		return retry_accept;
	}

	public void setRetry_accept(List<UserInfoEntry> retry_accept) {
		this.retry_accept = retry_accept;
	}

	public List<UserInfoEntry> getRetry_settlement() {
		return retry_settlement;
	}

	public void setRetry_settlement(List<UserInfoEntry> retry_settlement) {
		this.retry_settlement = retry_settlement;
	}

	public List<UserInfoEntry> getSettlement() {
		return settlement;
	}

	public void setSettlement(List<UserInfoEntry> settlement) {
		this.settlement = settlement;
	}

	public List<UserInfoEntry> getSettlement_declined() {
		return settlement_declined;
	}

	public void setSettlement_declined(List<UserInfoEntry> settlement_declined) {
		this.settlement_declined = settlement_declined;
	}

	public List<UserInfoEntry> getFailed() {
		return failed;
	}

	public void setFailed(List<UserInfoEntry> failed) {
		this.failed = failed;
	}

	public List<UserInfoEntry> getExecuted() {
		return executed;
	}

	public void setExecuted(List<UserInfoEntry> executed) {
		this.executed = executed;
	}

	public List<UserInfoEntry> getCompleted() {
		return completed;
	}

	public void setCompleted(List<UserInfoEntry> completed) {
		this.completed = completed;
	}

	public List<UserInfoEntry> getForwarded() {
		return forwarded;
	}

	public void setForwarded(List<UserInfoEntry> forwarded) {
		this.forwarded = forwarded;
	}

	public List<UserInfoEntry> getReturned() {
		return returned;
	}

	public void setReturned(List<UserInfoEntry> returned) {
		this.returned = returned;
	}


	
	

}
