package com.mybake.ppc.html.app.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mybake.poc.html.uiobjects.ResultObject;

public class ApplicationControllerTest {
	
	private ApplicationController appController = null;
	
	/** The context. */
	private AnnotationConfigApplicationContext context;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.mybake.ppc.html");
		context.refresh();

		appController = context.getBean(ApplicationController.class);

	}
	
	@Test
	public void testUserLogin_Sucessfull(){
		ResultObject result = appController.userLogin("admin", "admin");
		Assert.assertEquals("OK",result.getMessage());
		
		result = appController.userLogin("ADMIN", "admin");
		Assert.assertEquals("OK",result.getMessage());
		
		result = appController.userLogin("myBake", "admin");
		Assert.assertEquals("ERROR",result.getMessage());
	}
	
	@Test
	public void testCreateNewBill(){
		ResultObject result = appController.createNewBill("1");
		Assert.assertEquals("OK",result.getMessage());
	}

	@After
	public void tearDown(){
		appController = null;
		context = null;
	}
}
