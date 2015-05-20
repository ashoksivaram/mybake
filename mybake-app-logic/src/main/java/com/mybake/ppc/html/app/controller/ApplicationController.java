package com.mybake.ppc.html.app.controller;

import javax.print.attribute.standard.Severity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mybake.poc.html.uiobjects.ResultObject;
import com.mybake.ppc.html.app.common.AppLogManager;
import com.mybake.ppc.html.app.common.StringConstants;
import com.mybake.ppc.html.app.controller.requesthandler.RequestHandler;
import com.mybake.ppc.html.app.controller.requesthandler.RequestHandlerFactory;

@Controller
public class ApplicationController {

	@Autowired
	private RequestHandlerFactory factory;

	public ApplicationController() {

	}

	@RequestMapping(value = "/createNewBill", method = RequestMethod.GET)
	public @ResponseBody ResultObject createNewBill(@RequestParam(value = "userId") String userId) {
		AppLogManager.info("********** Creat New bill requested by  userId : " + userId + " Starts **********");
		ResultObject result = null;
		RequestHandler createNewBillRequestHandler = factory.getCreateNewBillRequestHandler();
		if (null != createNewBillRequestHandler) {
			result = createNewBillRequestHandler.handleRequest(userId);

		}
		else {
			result = new ResultObject();
			result.setMessage(StringConstants.ERROR);
			result.setSeverity(Severity.ERROR.getValue());
			AppLogManager.error("Unable to create Request Handler : Create New Bill.");
		}
		AppLogManager.info("********** Creat New bill requested by  (" + userId + ") Ends **********");
		return result;
	}
}
