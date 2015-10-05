package com.comandia.api.rest.v1.model;

import java.util.Date;

public class Page{
	Integer pageid;
	String title;
	String content;
	boolean isactive;
	Date datecreated;
	public Integer getPageid() {
		return pageid;
	}
	public void setPageid(Integer pageid) {
		this.pageid = pageid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

}
