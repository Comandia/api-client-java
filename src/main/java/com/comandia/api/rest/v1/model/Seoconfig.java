package com.comandia.api.rest.v1.model;

import java.util.Date;

public class Seoconfig {
	Integer seoconfigid;
	String objecttype;
	Integer objectid;
	String pagetitle;
	String pagedescription;
	String url;
	Date datecreated;
	public Integer getSeoconfigid() {
		return seoconfigid;
	}
	public void setSeoconfigid(Integer seoconfigid) {
		this.seoconfigid = seoconfigid;
	}
	
	
	public String getObjecttype() {
		return objecttype;
	}
	public void setObjecttype(String objecttype) {
		this.objecttype = objecttype;
	}
	public Integer getObjectid() {
		return objectid;
	}
	public void setObjectid(Integer objectid) {
		this.objectid = objectid;
	}
	public String getPagetitle() {
		return pagetitle;
	}
	public void setPagetitle(String pagetitle) {
		this.pagetitle = pagetitle;
	}
	public String getPagedescription() {
		return pagedescription;
	}
	public void setPagedescription(String pagedescription) {
		this.pagedescription = pagedescription;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	

}
