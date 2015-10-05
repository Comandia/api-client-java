package com.comandia.apiclient.model.response;

import com.mashape.unirest.http.HttpResponse;

public class Put extends Response {
	
	public Put(HttpResponse<String> response) {
		setResponse(response);
	}
	
}
