package com.comandia.apiclient.endpoint;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.comandia.apiclient.ApiErrorCollection;
import com.comandia.apiclient.model.response.Get;
import com.comandia.apiclient.model.response.Post;
import com.comandia.apiclient.model.response.Put;
import com.comandia.apiclient.util.UnirestUtil;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequestWithBody;


public class BaseEndpoint implements IEndpoint {
	
	public ApiErrorCollection apiErrorCollection;
	
	public BaseEndpoint() {
		UnirestUtil.init();
	}
	
	
	public ApiErrorCollection getApiErrorCollection() {
		return apiErrorCollection;
	}


	public Map<String,String> headers() {
		Map<String,String> headers = new HashMap<String, String>();
		headers.put("Authorization", "Bearer " + configuration.getAccessToken());
		headers.put("accept", "application/json");
		headers.put("content-type", "application/json");
		return headers;
	}
	
	private String getAnnotatedEndpoint(Object object) {
		if(object.getClass().isAnnotationPresent(Endpoint.class)){
			Annotation annotation = object.getClass().getAnnotation(Endpoint.class);
			Endpoint endpoint = (Endpoint)annotation;
			return endpoint.target();
		}
		return null;
	}
	
	
	public <T> List<?> getList(Object object) {
		String endpoint = getAnnotatedEndpoint(object);
		String requestUri = configuration.getApiBaseUri() + endpoint;
		GetRequest request = UnirestUtil.get(requestUri, headers());
		Get get = new Get(UnirestUtil.getObjectResponse(request), object);
		List<?> list = get.getAsList();
		apiErrorCollection = get.getApiErrorCollection();
		return list;
	}
	
	public Object getObject(Object object, int objectId) {
		String endpoint = getAnnotatedEndpoint(object);
		String requestUri = configuration.getApiBaseUri() + endpoint + "/" + objectId;
		GetRequest request = UnirestUtil.get(requestUri, headers());
		Get get = new Get(UnirestUtil.getObjectResponse(request), object);
		object = get.getAsObject();
		apiErrorCollection = get.getApiErrorCollection();
		return object;
	}

	public Integer post(Object object) {
		String endpoint = getAnnotatedEndpoint(object);
		String requestUri = configuration.getApiBaseUri() + endpoint;
		HttpRequestWithBody request = UnirestUtil.post(requestUri, object, headers());
		Post post = new Post(UnirestUtil.getObjectResponse(request));
		apiErrorCollection = post.getApiErrorCollection();
		return post.objectId();
	}
	
	public boolean put(Object object, int objectId) {
		String endpoint = getAnnotatedEndpoint(object);
		String requestUri = configuration.getApiBaseUri() + endpoint + "/" + objectId;
		HttpRequestWithBody request = UnirestUtil.put(requestUri, object, headers());
		Put put = new Put(UnirestUtil.getObjectResponse(request));
		apiErrorCollection = put.getApiErrorCollection();
		return put.isValid(request.getHttpMethod());
	}

}
