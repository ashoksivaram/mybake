package com.mybake.ppc.html.app.controller.requesthandler.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.mybake.ppc.html.app.controller.requesthandler.RequestHandler;
import com.mybake.ppc.html.app.controller.requesthandler.RequestHandlerFactory;

@Component
public class RequestHandlerFactoryImp implements RequestHandlerFactory {

	/** The app context. */
	@Autowired
	private ApplicationContext appContext;

	public RequestHandler getCreateNewBillRequestHandler() {
		return (CreateNewBillRequestHandlerImp) appContext.getBean("createNewBillRequestHandlerImp");
	}
}
