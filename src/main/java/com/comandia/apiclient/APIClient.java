package com.comandia.apiclient;

import java.util.List;

import com.comandia.api.rest.v1.model.Product;
import com.comandia.apiclient.endpoint.IEndpoint;
import com.comandia.apiclient.endpoint.ProductEndpoint;

public class APIClient extends APIBaseClient {
	
	private IEndpoint endpoint;
	
	public APIClient() {
		super();
	}

	public Product getProduct(int productId) {
		endpoint = new ProductEndpoint();
		return ((ProductEndpoint) endpoint).getProduct(productId);
	}

	public List<Product> getProducts() {
		endpoint = new ProductEndpoint();
		return ((ProductEndpoint) endpoint).getProducts();
	}

	public Integer addProduct(Product product) {
		endpoint = new ProductEndpoint();
		return ((ProductEndpoint) endpoint).addProduct(product);
	}
	
	public boolean updateProduct(Product product, int productId) {
		endpoint = new ProductEndpoint();
		return ((ProductEndpoint) endpoint).updateProduct(product, productId);
	}

	public IEndpoint getEndpoint() {
		return endpoint;
	}
}
