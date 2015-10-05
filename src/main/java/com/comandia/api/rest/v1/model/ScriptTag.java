package com.comandia.api.rest.v1.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ScriptTag {
	
	public Integer appscripttagid;
	public String event;
	public String url;
	private Integer appId;
	public Date dateupdated;
	public Date datecreated;
	
	public Integer getAppscripttagid() {
		return appscripttagid;
	}
	public void setAppscripttagid(Integer appscripttagid) {
		this.appscripttagid = appscripttagid;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public Date getDateupdated() {
		return dateupdated;
	}
	public void setDateupdated(Date dateupdated) {
		this.dateupdated = dateupdated;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

}
