package com.comandia.api.rest.v1.model;

import java.util.Date;

public class ShippingType {
	String shippingtypecode;
	String name;
	Integer maxunit;
	Integer priority;
	Date datecreated;
	
	public String getShippingtypecode() {
		return shippingtypecode;
	}
	public void setShippingtypecode(String shippingtypecode) {
		this.shippingtypecode = shippingtypecode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMaxunit() {
		return maxunit;
	}
	public void setMaxunit(Integer maxunit) {
		this.maxunit = maxunit;
	}
	
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	
	
}
