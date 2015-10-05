package com.comandia.apiclient.model.response;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mashape.unirest.http.HttpResponse;

public class Post extends Response {
	
	private static final String LOCATION = "location";
	
	private String location;
	private Integer objectId;
	
	public Post(HttpResponse<String> response) {
		setResponse(response);
		setLocation();
		setObjectId();
	}
	
	private void setLocation() {
		if(getResponse().getHeaders().containsKey(LOCATION) && getResponse().getHeaders().get(LOCATION).size()>0) {
			location = getResponse().getHeaders().get(LOCATION).get(0);
		}
	}
	
	private void setObjectId() {
		Pattern pattern = Pattern.compile("([0-9]*)$");
		Matcher matcher = pattern.matcher(location);
		if(matcher.find()) {
			objectId = Integer.valueOf(matcher.group());
		}
	}
	
	public String location() {
		return location;
	}
	
	public Integer objectId() {
		return objectId;
	}
}
