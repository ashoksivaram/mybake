package com.mybake.callback;

import com.google.appengine.api.datastore.PostPut;
import com.google.appengine.api.datastore.PutContext;

public class BillingCallback {
	
	@PostPut(kinds = {"Bill"})
	private void updateInventory(PutContext context){
		System.out.println("In billing modulde");
		System.out.println(context.getCurrentElement().getProperty("guid"));
	}

}
