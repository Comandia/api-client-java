package com.comandia.apiclient.util;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequest;
import com.mashape.unirest.request.HttpRequestWithBody;

public class UnirestUtil {
	
	public static void init() {
	
		Unirest.setObjectMapper(new ObjectMapper() {
			private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
	
			public <T> T readValue(String value, Class<T> valueType) {
				try {
					return jacksonObjectMapper.readValue(value, valueType);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
	
			public String writeValue(Object value) {
				try {
					return jacksonObjectMapper.writeValueAsString(value);
				} catch (JsonProcessingException e) {
					throw new RuntimeException(e);
				}
			}
		});
	}
	
	public static GetRequest get(String url, Map<String,String> headers) {
		GetRequest request = Unirest.get(url);
		request.headers(headers);
		return request;
	}
	
	public static HttpRequestWithBody post(String url, Object object, Map<String,String> headers) {
		HttpRequestWithBody request = Unirest.post(url);
		request.body(object);
		request.headers(headers);
		return request;
	}
	
	public static HttpRequestWithBody put(String url, Object object, Map<String,String> headers) {
		HttpRequestWithBody request = Unirest.put(url);
		request.body(object);
		request.headers(headers);
		return request;
	}
	
	public static HttpResponse<String> getObjectResponse(HttpRequest request) {
		try {
			return request.asString();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
