package com.comandia.api.rest.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface ObjectList<T> extends List<T> {

	
	@JsonProperty("results")
	public List<Object> list = new ArrayList<Object>();

}
