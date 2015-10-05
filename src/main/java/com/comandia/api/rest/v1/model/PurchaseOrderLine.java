package com.comandia.api.rest.v1.model;

import java.util.Date;

public class PurchaseOrderLine {
	Integer purchaseorderid;
	Integer lineno;
	Integer productid;
	Integer variantid;
	Integer quantity;
	Float price;
	boolean taxincluded;
	Date expecteddeliverydate;
	String supplierproductid;
	Integer receivedquantity;
	Date datereceived;
	Date datecreated;
	public Integer getPurchaseorderid() {
		return purchaseorderid;
	}
	public void setPurchaseorderid(Integer purchaseorderid) {
		this.purchaseorderid = purchaseorderid;
	}
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
	public boolean isTaxincluded() {
		return taxincluded;
	}
	public void setTaxincluded(boolean taxincluded) {
		this.taxincluded = taxincluded;
	}
	public Date getExpecteddeliverydate() {
		return expecteddeliverydate;
	}
	public void setExpecteddeliverydate(Date expecteddeliverydate) {
		this.expecteddeliverydate = expecteddeliverydate;
	}
	public String getSupplierproductid() {
		return supplierproductid;
	}
	public void setSupplierproductid(String supplierproductid) {
		this.supplierproductid = supplierproductid;
	}
	public Integer getReceivedquantity() {
		return receivedquantity;
	}
	public void setReceivedquantity(Integer receivedquantity) {
		this.receivedquantity = receivedquantity;
	}
	public Date getDatereceived() {
		return datereceived;
	}
	public void setDatereceived(Date datereceived) {
		this.datereceived = datereceived;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	

}
