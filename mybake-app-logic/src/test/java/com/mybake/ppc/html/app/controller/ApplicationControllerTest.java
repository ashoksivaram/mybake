package com.mybake.ppc.html.app.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mybake.poc.html.uiobjects.ResultObject;

public class ApplicationControllerTest {
	
	private ApplicationController appController = null;
	
	@Before
	public void setUp(){
		appController = new ApplicationController();
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

	@After
	public void tearDown(){
		appController = null;
	}
}
