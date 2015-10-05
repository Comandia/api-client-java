package com.comandia.api.rest.v1.model;

public class Error {
	String code;
	String field;
	String message;
	
	
/*	public Error(String code, String field, String message) {
		super();
		this.code = code;
		this.field = field;
		this.message = message;
	}*/
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
