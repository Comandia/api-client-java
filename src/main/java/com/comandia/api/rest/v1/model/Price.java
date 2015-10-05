package com.comandia.api.rest.v1.model;

public class Price {
	private String type;
	private Float price;
	private boolean taxincluded = true;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public boolean isTaxincluded() {
		return taxincluded;
	}
	public void setTaxincluded(boolean taxincluded) {
		this.taxincluded = taxincluded;
	}
	
	
	

}
