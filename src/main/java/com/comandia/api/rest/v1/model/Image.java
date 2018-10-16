package com.comandia.api.rest.v1.model;

import java.util.Date;

public class Image {
	Integer resourceid;
	boolean isdefault;
	private Integer sortorder;
	String fullsizeurl;
	String thumbnailsizeurl;
	Integer filesize;
	Date datecreated;
	
	public Integer getResourceid() {
		return resourceid;
	}
	public void setResourceid(Integer resourceid) {
		this.resourceid = resourceid;
	}
	public boolean isIsdefault() {
		return isdefault;
	}
	public void setIsdefault(boolean isdefault) {
		this.isdefault = isdefault;
	}
	public String getFullsizeurl() {
		return fullsizeurl;
	}
	public void setFullsizeurl(String fullsizeurl) {
		this.fullsizeurl = fullsizeurl;
	}
	public String getThumbnailsizeurl() {
		return thumbnailsizeurl;
	}
	public void setThumbnailsizeurl(String thumbnailsizeurl) {
		this.thumbnailsizeurl = thumbnailsizeurl;
	}
	public Integer getFilesize() {
		return filesize;
	}
	public void setFilesize(Integer filesize) {
		this.filesize = filesize;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	public Integer getSortorder() {
		return sortorder;
	}
	public void setSortorder(Integer sortorder) {
		this.sortorder = sortorder;
	}
	

}
