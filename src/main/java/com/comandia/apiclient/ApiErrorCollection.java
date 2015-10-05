package com.comandia.apiclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.comandia.api.rest.v1.model.ErrorResponse;
import com.comandia.apiclient.util.JsonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiErrorCollection {
	
	private List<ErrorResponse> errorResponses;
	
	public ApiErrorCollection() {
		errorResponses = new ArrayList<ErrorResponse>();
	}
	
	public void addErrorResponse(ErrorResponse errorResponse) {
		errorResponses.add(errorResponse);
	}
	
	public void addErrorResponse(String jsonString) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			if(JsonUtil.hasKey(jsonString, "errors")) {
				ErrorResponse errorResponse = objectMapper.readValue(jsonString, ErrorResponse.class);
				errorResponses.add(errorResponse);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public List<ErrorResponse> getErrorResponses() {
		return errorResponses;
	}
	
	public ErrorResponse getLastErrorResponse() {
		if(errorResponses.size()<1) return null;
		return errorResponses.get(errorResponses.size() - 1);
	}
	
}
