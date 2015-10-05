package com.comandia.api.rest.v1.model;

import java.util.Date;

public class Shippingzone {
	Integer shippingzoneid;
	String countrycode;
	String name;
	String postalcoderule;
	boolean isdefault;
	boolean iseditable;
	Date datecreated;
	public Integer getShippingzoneid() {
		return shippingzoneid;
	}
	public void setShippingzoneid(Integer shippingzoneid) {
		this.shippingzoneid = shippingzoneid;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostalcoderule() {
		return postalcoderule;
	}
	public void setPostalcoderule(String postalcoderule) {
		this.postalcoderule = postalcoderule;
	}
	public boolean isIsdefault() {
		return isdefault;
	}
	public void setIsdefault(boolean isdefault) {
		this.isdefault = isdefault;
	}
	public boolean isIseditable() {
		return iseditable;
	}
	public void setIseditable(boolean iseditable) {
		this.iseditable = iseditable;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	
	
	

}
