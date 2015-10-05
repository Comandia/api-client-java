package com.comandia.apiclient.model.response;

import com.mashape.unirest.http.HttpMethod;
import com.mashape.unirest.http.HttpResponse;

public interface IResponse {
	
	public Integer statusCode();
	public boolean isValid(HttpMethod httpMethod);
	public void setResponse(HttpResponse<String> response);
	public HttpResponse<String> getResponse();
	
}
