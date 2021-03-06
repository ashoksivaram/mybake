package com.billing.service;

import java.net.UnknownHostException;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.mybake.billing.Bill;
import com.mybake.inentory.Product;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestBillingService {

	public static void main(String[] args) throws UnknownHostException {
		String BILL_URI = "http://localhost:8080/mybake/billing/add";
		Bill bill = new Bill();
		bill.setGuid(new Integer(123456));
		Gson gson = new Gson();
		String request = gson.toJson(bill);
		Client client = Client.create();
		WebResource r = client.resource(BILL_URI);
		ClientResponse response = r.type(MediaType.APPLICATION_JSON).put(
				ClientResponse.class, request);
		System.out.println("Sent the request to add bill, response is  "+response.toString());
		
		
		String INV_URI = "http://localhost:57394/mybake/inventory/add";
		Product product = new Product();
		product.setProductId("Milk");
		gson = new Gson();
		request = gson.toJson(product);
		client = Client.create();
		r = client.resource(INV_URI);
		response = r.type(MediaType.APPLICATION_JSON).put(
				ClientResponse.class, request);
		System.out.println("Sent the request to add product, response is  "+response.toString());
	}
}