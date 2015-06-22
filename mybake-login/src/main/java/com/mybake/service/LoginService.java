package com.mybake.service;

import javax.print.attribute.standard.Severity;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;

import com.mybake.common.ResultObject;
import com.mybake.constants.StringConstants;
import com.mybake.log.LogManager;
import com.mybake.uiobjects.JSFeatureList;
import com.mybake.uiobjects.JSUserInfo;

@Controller
@Path("/login")
public class LoginService {

	@GET
	@Path("/userLogin")
	@Consumes(MediaType.TEXT_HTML)
	@Produces(MediaType.APPLICATION_JSON)
	public Response userLogin(String userName, String password) {

		LogManager.info("********** User Login reqquested for : " + userName
				+ " Starts **********");
		ResultObject result = new ResultObject();
		JSUserInfo userInfo = new JSUserInfo();
		if (null != userName && null != password
				&& userName.equalsIgnoreCase("admin")
				&& password.equalsIgnoreCase("admin")) {
			result.setMessage(StringConstants.OK);
			userInfo.setUserId(userName);
			userInfo.setUserName("Administrator");
			JSFeatureList featureList = new JSFeatureList();
			featureList.setBilling(true);
			featureList.setReports(true);
			featureList.setInventory(true);
			userInfo.setFeatureList(featureList);
			result.setObject(userInfo);
			result.setSeverity(Severity.REPORT.getValue());
			LogManager.error("Logged in succefully.");
		} else {
			result.setMessage(StringConstants.ERROR);
			// result.setSeverity(Severity.ERROR.getValue());
			LogManager.error("Unable to login.");
		}
		LogManager.info("********** User Login reqquested for : " + userName
				+ " Ends **********");

		return Response.status(200).entity(userInfo).build();
	}
}
