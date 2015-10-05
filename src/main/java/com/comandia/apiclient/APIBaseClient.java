package com.comandia.apiclient;

import com.comandia.apiclient.model.Configuration;
import com.comandia.apiclient.util.ConfigurationUtil;

public class APIBaseClient {
	
	
	
	private Configuration configuration;
	
	private ApiErrorCollection apiErrorCollection;
	
	public APIBaseClient() {
		ConfigurationUtil.load();
		configuration = ConfigurationUtil.configuration;
		
	}


	public void setAccessToken(String accessToken) {
		configuration.setAccessToken(accessToken);
	}

	public String getAccessToken() {
		return configuration.getAccessToken();
	}



	public void setDebugModeActive(boolean isDebugModeActive) {
		configuration.setDebugModeActive(isDebugModeActive);
	}


	public ApiErrorCollection getApiErrorCollection() {
		return apiErrorCollection;
	}


	public void setApiErrorCollection(ApiErrorCollection apiErrorCollection) {
		this.apiErrorCollection = apiErrorCollection;
	}
	

}
