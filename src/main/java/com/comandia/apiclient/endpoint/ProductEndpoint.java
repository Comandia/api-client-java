package com.comandia.apiclient.endpoint;

import java.util.List;

import com.comandia.api.rest.v1.model.Product;

public class ProductEndpoint extends BaseEndpoint {
	
	public ProductEndpoint() {
		super();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Product> getProducts() {
		return (List<Product>) getList(new Product());
	}
	
	public Product getProduct(int productId) {
		return (Product) getObject(new Product(), productId);
	}
	
	public Integer addProduct(Product product) {
		return post(product);
	}
	
	public boolean updateProduct(Product product, int productId) {
		return put(product, productId);
	}
}
