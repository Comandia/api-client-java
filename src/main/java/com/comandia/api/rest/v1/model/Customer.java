package com.comandia.api.rest.v1.model;

import java.util.Date;

public class Customer {
	Integer customerid;
	Integer addressid;
	String customerno;
	String tags;
	boolean isacceptmarketing;
	Date datecreated;
	
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public Integer getAddressid() {
		return addressid;
	}
	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}
	public String getCustomerno() {
		return customerno;
	}
	public void setCustomerno(String customerno) {
		this.customerno = customerno;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public boolean isIsacceptmarketing() {
		return isacceptmarketing;
	}
	public void setIsacceptmarketing(boolean isacceptmarketing) {
		this.isacceptmarketing = isacceptmarketing;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	

}
