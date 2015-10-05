package com.comandia.api.rest.v1.model;

public class PaymentMethod {
	String paymentmethodcode;
	String name;
	boolean isactive;
	Integer sortorder;
	
	public String getPaymentmethodcode() {
		return paymentmethodcode;
	}
	public void setPaymentmethodcode(String paymentmethodcode) {
		this.paymentmethodcode = paymentmethodcode;
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
	public Integer getSortorder() {
		return sortorder;
	}
	public void setSortorder(Integer sortorder) {
		this.sortorder = sortorder;
	}
	
	
	
}
