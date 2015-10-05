package com.comandia.api.rest.v1.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public interface IObjectList<T>  extends List<Object> {

	@JsonProperty("results")
	public List<?> list=null;
}
