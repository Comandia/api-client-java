package com.comandia.apiclient.model;

import java.net.URI;

import com.comandia.apiclient.util.ConfigurationUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Configuration {
	
	@JsonProperty("apiBaseUri")
	URI apiBaseUri;
	
	@JsonProperty("defaultAccessToken")
	String defaultAccessToken;
	
	String accessToken;
	
	@JsonProperty("isDebugModeActive")
	boolean isDebugModeActive;
	
	@JsonProperty("retryRequestNextAttempDelay")
	int retryRequestNextAttempDelay;
	
	@JsonProperty("retryRequestMaxAttempt")
	int retryRequestMaxAttempt;

	/**
	 * @return the apiBaseUri
	 */
	public URI getApiBaseUri() {
		return apiBaseUri;
	}

	/**
	 * @param apiBaseUri the apiBaseUri to set
	 */
	public void setApiBaseUri(URI apiBaseUri) {
		this.apiBaseUri = apiBaseUri;
	}

	/**
	 * @return the defaultAccessToken
	 */
	public String getDefaultAccessToken() {
		return defaultAccessToken;
	}

	/**
	 * @param defaultAccessToken the defaultAccessToken to set
	 */
	public void setDefaultAccessToken(String defaultAccessToken) {
		this.defaultAccessToken = defaultAccessToken;
	}

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		if(accessToken==null) {
			accessToken = defaultAccessToken;
		}
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	
	/**
	 * @return the isDebugModeActive
	 */
	public boolean isDebugModeActive() {
		return isDebugModeActive;
	}

	/**
	 * @param isDebugModeActive the isDebugModeActive to set
	 */
	public void setDebugModeActive(boolean isDebugModeActive) {
		this.isDebugModeActive = isDebugModeActive;
	}

	/**
	 * @return the retryRequestNextAttempDelay
	 */
	public int getRetryRequestNextAttempDelay() {
		return retryRequestNextAttempDelay;
	}

	/**
	 * @param retryRequestNextAttempDelay the retryRequestNextAttempDelay to set
	 */
	public void setRetryRequestNextAttempDelay(int retryRequestNextAttempDelay) {
		this.retryRequestNextAttempDelay = retryRequestNextAttempDelay;
	}

	/**
	 * @return the retryRequestMaxAttempt
	 */
	public int getRetryRequestMaxAttempt() {
		return retryRequestMaxAttempt;
	}

	/**
	 * @param retryRequestMaxAttempt the retryRequestMaxAttempt to set
	 */
	public void setRetryRequestMaxAttempt(int retryRequestMaxAttempt) {
		this.retryRequestMaxAttempt = retryRequestMaxAttempt;
	}

	
	
}
