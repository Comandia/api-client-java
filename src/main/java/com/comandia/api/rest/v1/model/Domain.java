package com.comandia.api.rest.v1.model;

import java.util.Date;

public class Domain {
	String domain;
	Integer shopid;
	Date datecreated;
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	

}
