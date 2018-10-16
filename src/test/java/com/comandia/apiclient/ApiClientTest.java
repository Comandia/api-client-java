package com.comandia.apiclient;

import java.util.List;
import java.util.UUID;

import com.comandia.api.rest.v1.model.ErrorResponse;
import com.comandia.api.rest.v1.model.Product;
import com.comandia.apiclient.endpoint.BaseEndpoint;
import com.comandia.apiclient.endpoint.IEndpoint;
import com.comandia.apiclient.endpoint.ProductEndpoint;

import junit.framework.TestCase;

public class ApiClientTest extends TestCase {
	
	public static final String TEST_ACCESS_TOKEN = "a3817baf92b4ce7dfaf67620c712bff6";
	
	public void testPostProduct() {
		APIClient client = new APIClient();
		client.setAccessToken(TEST_ACCESS_TOKEN);
		Product product = client.getProduct(1);
		product.model=product.model + UUID.randomUUID().toString();
		Integer postResponse = client.addProduct(product);
		assertEquals(true, postResponse!=null);
		
		boolean errorResponse = errorResponseCheck((ProductEndpoint) client.getEndpoint());
		assertEquals(true, errorResponse);
	}
	
	public void testPutProduct() {
		APIClient client = new APIClient();
		client.setAccessToken(TEST_ACCESS_TOKEN);
		Product product = client.getProduct(1);
		boolean putResponse = client.updateProduct(product, 1);
		assertEquals(true, putResponse);
		
		boolean errorResponse = errorResponseCheck((ProductEndpoint) client.getEndpoint());
		assertEquals(true, errorResponse);
	}
	
	public void testGetProducts() {
		APIClient client = new APIClient();
		client.setAccessToken(TEST_ACCESS_TOKEN);
		List<Product> products = client.getProducts();
		Product product = products.get(0);
		assertEquals(true, product!=null);
		
		boolean errorResponse = errorResponseCheck((ProductEndpoint) client.getEndpoint());
		assertEquals(true, errorResponse);
	}
	
	public void testGetProduct() {
		APIClient client = new APIClient();
		client.setAccessToken(TEST_ACCESS_TOKEN);
		Product product = client.getProduct(1);
		assertEquals(true, product!=null);
		
		boolean errorResponse = errorResponseCheck((ProductEndpoint) client.getEndpoint());
		assertEquals(true, errorResponse);
	}
	
	
	private boolean errorResponseCheck(IEndpoint endpoint) {
		ApiErrorCollection apiErrorCollection = ((BaseEndpoint) endpoint).getApiErrorCollection();
		ErrorResponse errorResponse = apiErrorCollection.getLastErrorResponse();
		if(errorResponse!=null) {
			System.err.println("error response: " + errorResponse.getErrors().get(0).getMessage());
			return false;
		}
		return true;
	}
}
