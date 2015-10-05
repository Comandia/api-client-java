package com.comandia.apiclient.model.response;

import com.comandia.apiclient.ApiErrorCollection;
import com.comandia.apiclient.endpoint.IEndpoint;
import com.mashape.unirest.http.HttpMethod;
import com.mashape.unirest.http.HttpResponse;

public class Response implements IResponse {
	
	private HttpResponse<String> response;
	
	private ApiErrorCollection apiErrorCollection = new ApiErrorCollection();
	
	@Override
	public Integer statusCode() {
		return response.getStatus();
	}

	@Override
	public boolean isValid(HttpMethod httpMethod) {
		return IEndpoint.validResponseCodes.containsKey(httpMethod) && (IEndpoint.validResponseCodes.get(httpMethod).contains(statusCode()));
	}

	@Override
	public void setResponse(HttpResponse<String> response) {
		this.response = response;
		
	}

	@Override
	public HttpResponse<String> getResponse() {
		return response;
	}

	public ApiErrorCollection getApiErrorCollection() {
		return apiErrorCollection;
	}

	public void setApiErrorCollection(ApiErrorCollection apiErrorCollection) {
		this.apiErrorCollection = apiErrorCollection;
	}

}
