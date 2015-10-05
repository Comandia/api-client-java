package com.comandia.api.rest.v1.model;

import java.util.Date;

public class Carrier {
	Integer carrierid;
	String name;
	boolean isactive;
	boolean isdefault;
	boolean isselfpickavailable;
	boolean ishomedeliveryavailable;
	Float freeshippingabove;
	Integer sortorder;
	Date datecreated;
	
	public Integer getCarrierid() {
		return carrierid;
	}
	public void setCarrierid(Integer carrierid) {
		this.carrierid = carrierid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public boolean isIsdefault() {
		return isdefault;
	}
	public void setIsdefault(boolean isdefault) {
		this.isdefault = isdefault;
	}
	public boolean isIsselfpickavailable() {
		return isselfpickavailable;
	}
	public void setIsselfpickavailable(boolean isselfpickavailable) {
		this.isselfpickavailable = isselfpickavailable;
	}
	public boolean isIshomedeliveryavailable() {
		return ishomedeliveryavailable;
	}
	public void setIshomedeliveryavailable(boolean ishomedeliveryavailable) {
		this.ishomedeliveryavailable = ishomedeliveryavailable;
	}
	public Float getFreeshippingabove() {
		return freeshippingabove;
	}
	public void setFreeshippingabove(Float freeshippingabove) {
		this.freeshippingabove = freeshippingabove;
	}
	public Integer getSortorder() {
		return sortorder;
	}
	public void setSortorder(Integer sortorder) {
		this.sortorder = sortorder;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	

}
