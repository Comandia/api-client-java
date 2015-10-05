package com.comandia.api.rest.v1.model;

import java.util.Date;

public class SalesOrderLine {
	Integer lineno;
	Integer productid;
	Integer variantid;
	String feetypecode;
	String shippingtypecode;
	Integer quantity;
	Float price;
	boolean istaxincluded;
	String comment;
	Date datecreated;
	
	
	public Integer getLineno() {
		return lineno;
	}
	public void setLineno(Integer lineno) {
		this.lineno = lineno;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public Integer getVariantid() {
		return variantid;
	}
	public void setVariantid(Integer variantid) {
		this.variantid = variantid;
	}
	public String getFeetypecode() {
		return feetypecode;
	}
	public void setFeetypecode(String feetypecode) {
		this.feetypecode = feetypecode;
	}
	public String getShippingtypecode() {
		return shippingtypecode;
	}
	public void setShippingtypecode(String shippingtypecode) {
		this.shippingtypecode = shippingtypecode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public boolean isIstaxincluded() {
		return istaxincluded;
	}
	public void setIstaxincluded(boolean istaxincluded) {
		this.istaxincluded = istaxincluded;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	

}
