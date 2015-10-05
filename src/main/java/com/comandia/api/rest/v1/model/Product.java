package com.comandia.api.rest.v1.model;

import java.util.Date;
import java.util.List;

import com.comandia.apiclient.endpoint.Endpoint;

@Endpoint(target="products")
public class Product {
	public Integer productid;
	public String model;
	public Brand brand;
	public Category maincategory;
	public Category subcategory;
	public Price sellingprice;
	public Price purchaseprice;
	public Price recommendedprice;
	public Float weight;
	public String shippingtypecode;
	public String sku;
	public String barcode;
	public boolean isactive;
	public boolean iseol;
	public boolean isinventorytracked;
	public Float valueaddedtax;
	public String deliverytimecode;
	private Date datecreated;
	private List<ProductInfo> productinfos;
	private List<ProductVariant> variants;
	private List<ProductStock> stocks;
	private List<ProductInventory> productinventories;
	private List<Image> resources;
	
	public static Product build(){
		return new Product();
	}
	
	public Product id(Integer id ){
		this.productid = id;
		return this;
	}
	public Product model(String model){
		this.model = model;
		return this;
	}
	
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Category getMaincategory() {
		return maincategory;
	}
	public void setMaincategory(Category maincategory) {
		this.maincategory = maincategory;
	}
	public Category getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(Category subcategory) {
		this.subcategory = subcategory;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weigth) {
		this.weight = weigth;
	}
	public String getShippingtypecode() {
		return shippingtypecode;
	}
	public void setShippingtypecode(String shippingtypeCcde) {
		this.shippingtypecode = shippingtypeCcde;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public boolean isIseol() {
		return iseol;
	}
	public void setIseol(boolean iseol) {
		this.iseol = iseol;
	}
	public boolean isIsinventorytracked() {
		return isinventorytracked;
	}
	public void setIsinventorytracked(boolean isinventorytracked) {
		this.isinventorytracked = isinventorytracked;
	}
	public Float getValueaddedtax() {
		return valueaddedtax;
	}
	public void setValueaddedtax(Float valueaddedtax) {
		this.valueaddedtax = valueaddedtax;
	}
	public String getDeliverytimecode() {
		return deliverytimecode;
	}
	public void setDeliverytimecode(String deliverytimecode) {
		this.deliverytimecode = deliverytimecode;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	
	public Price getSellingprice() {
		return sellingprice;
	}

	public void setSellingprice(Price sellingprice) {
		this.sellingprice = sellingprice;
	}

	public Price getPurchaseprice() {
		return purchaseprice;
	}

	public void setPurchaseprice(Price purchaseprice) {
		this.purchaseprice = purchaseprice;
	}

	public Price getRecommendedprice() {
		return recommendedprice;
	}

	public void setRecommendedprice(Price recommendedprice) {
		this.recommendedprice = recommendedprice;
	}

	

	public List<ProductVariant> getVariants() {
		return variants;
	}

	public void setVariants(List<ProductVariant> variants) {
		this.variants = variants;
	}

	public List<ProductStock> getStocks() {
		return stocks;
	}

	public void setStocks(List<ProductStock> stocks) {
		this.stocks = stocks;
	}

	

	public List<ProductInfo> getProductinfos() {
		return productinfos;
	}

	public void setProductinfos(List<ProductInfo> productinfos) {
		this.productinfos = productinfos;
	}

	public List<Image> getResources() {
		return resources;
	}

	public void setResources(List<Image> resources) {
		this.resources = resources;
	}

	public List<ProductInventory> getProductinventories() {
		return productinventories;
	}

	public void setProductinventories(List<ProductInventory> productinventories) {
		this.productinventories = productinventories;
	}

}
