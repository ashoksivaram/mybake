package com.mybake.service;

import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;


public class TestLoginService {
	
	@Test
	public void test(){
		LoginService loginService = new LoginService();
		Response response = loginService.userLogin("admin", "admin");
		Assert.assertNotNull(response);
		Assert.assertNotNull(response.getEntity());
		//TODO need to check the response
	}
	

}
