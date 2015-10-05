package com.comandia.api.rest.v1.model;

import java.util.Date;

public class SalesOrder{
	Integer orderid;
	String orderno;
	Customer customer;
	Address address;
	Carrier carrier;
	Shippingzone shippingzone;
	String paymentmethodcode;
	String statuscode;
	String sessionid;
	String originip;
	String originref;
	String originsource;
	boolean isselfpick;
	String selfpickstorecode;
	String trackingcode;
	String shippinglabelpdfurl;
	Date datecreated;
	
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Carrier getCarrier() {
		return carrier;
	}
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}
	
	public Shippingzone getShippingzone() {
		return shippingzone;
	}
	public void setShippingzone(Shippingzone shippingzone) {
		this.shippingzone = shippingzone;
	}
	public String getPaymentmethodcode() {
		return paymentmethodcode;
	}
	public void setPaymentmethodcode(String paymentmethodcode) {
		this.paymentmethodcode = paymentmethodcode;
	}
	public String getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getOriginip() {
		return originip;
	}
	public void setOriginip(String originip) {
		this.originip = originip;
	}
	public String getOriginref() {
		return originref;
	}
	public void setOriginref(String originref) {
		this.originref = originref;
	}
	public String getOriginsource() {
		return originsource;
	}
	public void setOriginsource(String originsource) {
		this.originsource = originsource;
	}
	public boolean isIsselfpick() {
		return isselfpick;
	}
	public void setIsselfpick(boolean isselfpick) {
		this.isselfpick = isselfpick;
	}
	public String getSelfpickstorecode() {
		return selfpickstorecode;
	}
	public void setSelfpickstorecode(String selfpickstorecode) {
		this.selfpickstorecode = selfpickstorecode;
	}
	public String getTrackingcode() {
		return trackingcode;
	}
	public void setTrackingcode(String trackingcode) {
		this.trackingcode = trackingcode;
	}
	public String getShippinglabelpdfurl() {
		return shippinglabelpdfurl;
	}
	public void setShippinglabelpdfurl(String shippinglabelpdfurl) {
		this.shippinglabelpdfurl = shippinglabelpdfurl;
	}
	public Date getDatecreated() {
		return datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	
	
	
	

}
