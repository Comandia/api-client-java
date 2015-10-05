package com.comandia.api.rest.v1.model;

public class Config {

	public String type;
	public String name;
	public String value;
	
	
	public Config(String type, String name, String value) {
		super();
		this.type = type;
		this.name = name;
		this.value = value;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
