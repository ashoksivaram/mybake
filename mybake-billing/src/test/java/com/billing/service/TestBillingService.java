package com.billing.service;

import java.net.UnknownHostException;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.mybake.billing.Bill;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestBillingService {

	public static void main(String[] args) throws UnknownHostException {
		String USER_URI = "http://localhost:8080/mybake/billing/add";
		Bill bill = new Bill();
		bill.setGuid(new Integer(123456));
		Gson gson = new Gson();
		String request = gson.toJson(bill);
		Client client = Client.create();
		WebResource r = client.resource(USER_URI);
		ClientResponse response = r.type(MediaType.APPLICATION_JSON).put(
				ClientResponse.class, request);
		System.out.println("Sent the request, response is  "+response.toString());
	}
}