package com.comandia.api.rest.v1.model;

import java.util.Date;

public class OrderStatus {
	String statuscode;
	String name;
	boolean isopenorder;
	boolean isvalidorder;
	private Date datecreated;
	
	public String getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIsopenorder() {
		return isopenorder;
	}
	public void setIsopenorder(boolean isopenorder) {
		this.isopenorder = isopenorder;
	}
	public boolean isIsvalidorder() {
		return isvalidorder;
	}
	public void setIsvalidorder(boolean isvalidorder) {
		this.isvalidorder = isvalidorder;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	

}
