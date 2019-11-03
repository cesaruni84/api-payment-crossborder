/**
 * 
 */
package com.bbva.interpay.hackaton.security;

import java.io.Serializable;

/**
 * @author P019956
 *
 */
public class AccessTokenObject implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String access_token;
    private String token_type;
    private String expires_in;
    private String scope;
    private String jti;
    
	public AccessTokenObject() {
		super();
	}

	public AccessTokenObject(String access_token, String token_type, String expires_in, String scope, String jti) {
		this.access_token = access_token;
		this.token_type = token_type;
		this.expires_in = expires_in;
		this.scope = scope;
		this.jti = jti;
	}
	
	public String getAccessToken() {
		return access_token;
	}
	public void setAccessToken(String accessToken) {
		this.access_token = accessToken;
	}
	public String getTokenType() {
		return token_type;
	}
	public void setTokenType(String tokenType) {
		this.token_type = tokenType;
	}
	public String getExpiresIn() {
		return expires_in;
	}
	public void setExpiresIn(String expiresIn) {
		this.expires_in = expiresIn;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getJti() {
		return jti;
	}
	public void setJti(String jti) {
		this.jti = jti;
	}
    
    
 

}
