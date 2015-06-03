package com.mybake.callback;

import javax.jdo.PersistenceManager;

import com.google.appengine.api.datastore.PostPut;
import com.google.appengine.api.datastore.PutContext;
import com.mybake.persistence.PersistenceManagerFactoryImpl;

public class BillingCallback {
	
	@PostPut(kinds = {"Bill"})
	private void updateInventory(PutContext context){
		System.out.println("In billing modulde");
		System.out.println(context.getCurrentElement().getProperty("guid"));
	}

}
