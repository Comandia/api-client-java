package com.comandia.apiclient.model.response;

import java.io.IOException;
import java.util.List;

import org.json.JSONObject;

import com.comandia.api.rest.v1.model.ResponseObjectList;
import com.comandia.apiclient.util.JsonUtil;
import com.comandia.apiclient.util.ObjectListUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;

public class Get extends Response {
	
	private Object object;
	
	public Get(HttpResponse<String> response, Object object) {
		setResponse(response);
		this.object = object;
	}
	
	public List<?> getAsList() {
		String jsonString = getResponse().getBody();
		JSONObject jsonObject = JsonUtil.toJsonObject(jsonString);
		if(jsonObject!=null) {
			getApiErrorCollection().addErrorResponse(jsonString);
		}
		else {
			System.err.println(statusCode() + " - " +jsonString);
		}
		List<?> list = null;
		if(jsonObject!=null) {
			ResponseObjectList objectListResponse = ObjectListUtil.getObjectList(jsonObject, object.getClass());
			list = objectListResponse.getResults();
		}
		return list;
	}
	
	public Object getAsObject() {
		String jsonString = getResponse().getBody();
		JSONObject jo = JsonUtil.toJsonObject(jsonString);
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			object = objectMapper.readValue(jo.toString(), object.getClass());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return object;
	}
}
