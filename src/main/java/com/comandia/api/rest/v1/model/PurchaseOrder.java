package com.comandia.api.rest.v1.model;

import java.util.Date;

public class PurchaseOrder {
	Integer purchaseorderid;
	String purchaseorderno;
	Integer supplierid;
	String status;
	Date datecreated;
	public Integer getPurchaseorderid() {
		return purchaseorderid;
	}
	public void setPurchaseorderid(Integer purchaseorderid) {
		this.purchaseorderid = purchaseorderid;
	}
	public String getPurchaseorderno() {
		return purchaseorderno;
	}
	public void setPurchaseorderno(String purchaseorderno) {
		this.purchaseorderno = purchaseorderno;
	}
	public Integer getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	
	

}
