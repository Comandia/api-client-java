package com.comandia.apiclient.endpoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.comandia.apiclient.model.Configuration;
import com.comandia.apiclient.util.ConfigurationUtil;
import com.mashape.unirest.http.HttpMethod;

public interface IEndpoint {

	//public enum  REQUEST_METHOD {GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS}
	
	@SuppressWarnings("serial")
	public Map<HttpMethod,List<Integer>> validResponseCodes = Collections.unmodifiableMap(new HashMap<HttpMethod, List<Integer>>()
	{
		{
			put(HttpMethod.POST, Arrays.asList(201));
			put(HttpMethod.PUT, Arrays.asList(200));
			put(HttpMethod.GET, Arrays.asList(200));
		}
	}); 
	
//	public boolean isValidResponseCode(HttpMethod httpMethod, int responseCode);

	public static Configuration configuration = ConfigurationUtil.configuration;

}
