package com.comandia.api.rest.v1.model;

import java.util.Date;

public class Stock {
	Integer stockid;
	String name;
	String code;
	boolean issellingstock;
	boolean isreturnstock;
	Date datecreated;
	public Integer getStockid() {
		return stockid;
	}
	public void setStockid(Integer stockid) {
		this.stockid = stockid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isIssellingstock() {
		return issellingstock;
	}
	public void setIssellingstock(boolean issellingstock) {
		this.issellingstock = issellingstock;
	}
	public boolean isIsreturnstock() {
		return isreturnstock;
	}
	public void setIsreturnstock(boolean isreturnstock) {
		this.isreturnstock = isreturnstock;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	

}
