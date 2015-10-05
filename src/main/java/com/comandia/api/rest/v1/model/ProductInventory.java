package com.comandia.api.rest.v1.model;

public class ProductInventory {
	Integer productid;
	Integer variantid;
	Integer physicalstock;
	Integer openorderquantity;
	Integer availablestock;
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
	public Integer getPhysicalstock() {
		return physicalstock;
	}
	public void setPhysicalstock(Integer physicalstock) {
		this.physicalstock = physicalstock;
	}
	public Integer getOpenorderquantity() {
		return openorderquantity;
	}
	public void setOpenorderquantity(Integer openorderquantity) {
		this.openorderquantity = openorderquantity;
	}
	public Integer getAvailablestock() {
		return availablestock;
	}
	public void setAvailablestock(Integer availablestock) {
		this.availablestock = availablestock;
	}
	
	

}
