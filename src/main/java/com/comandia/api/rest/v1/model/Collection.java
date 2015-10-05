package com.comandia.api.rest.v1.model;

import java.util.Date;

public class Collection {
	Integer collectionid;
	String title;
	String description;
	Integer sorting;
	boolean isvisible;
	Date datecreated;
	
	public Integer getCollectionid() {
		return collectionid;
	}
	public void setCollectionid(Integer collectionid) {
		this.collectionid = collectionid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getSorting() {
		return sorting;
	}
	public void setSorting(Integer sorting) {
		this.sorting = sorting;
	}
	public boolean isIsvisible() {
		return isvisible;
	}
	public void setIsvisible(boolean isvisible) {
		this.isvisible = isvisible;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	

}
