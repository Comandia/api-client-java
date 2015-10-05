package com.comandia.api.rest.v1.model;

import java.util.Date;

public class Supplier {
	Integer supplierid;
	String name;
	String supplierno;
	String countrycode;
	Integer addressid;
	String externalreference;
	String iban;
	String bic;
	String vatnumber;
	String paymentterm;
	String comment;
	Date datecreated;
	
	public Integer getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupplierno() {
		return supplierno;
	}
	public void setSupplierno(String supplierno) {
		this.supplierno = supplierno;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public Integer getAddressid() {
		return addressid;
	}
	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}
	public String getExternalreference() {
		return externalreference;
	}
	public void setExternalreference(String externalreference) {
		this.externalreference = externalreference;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getVatnumber() {
		return vatnumber;
	}
	public void setVatnumber(String vatnumber) {
		this.vatnumber = vatnumber;
	}
	public String getPaymentterm() {
		return paymentterm;
	}
	public void setPaymentterm(String paymentterm) {
		this.paymentterm = paymentterm;
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
