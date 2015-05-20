package com.mybake.ppc.html.app.controller.requesthandler.imp;

import javax.print.attribute.standard.Severity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mybake.poc.html.uiobjects.ResultObject;
import com.mybake.ppc.html.app.common.StringConstants;
import com.mybake.ppc.html.app.controller.builder.CreateNewBillPageBuilder;
import com.mybake.ppc.html.app.controller.builder.imp.CreateNewBillPageBuilderImp;
import com.mybake.ppc.html.app.model.repo.BillRepo;
import com.mybake.ppc.html.app.model.repo.ProductRepo;
import com.mybake.ppc.html.app.model.repo.UserRepo;

@Component
public class CreateNewBillRequestHandlerImp extends RequestHandlerImp {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private BillRepo billRepo;

	@Override
	public ResultObject handleRequest(String value) {
		ResultObject resultObject = new ResultObject();
		CreateNewBillPageBuilder builder = new CreateNewBillPageBuilderImp();
		if (builder.build(userRepo, productRepo, billRepo, value)) {
			resultObject.setObject(builder.getResult());
			resultObject.setMessage(StringConstants.OK);
			resultObject.setSeverity(Severity.REPORT.getValue());
		}
		else {
			resultObject.setMessage(StringConstants.ERROR);
			resultObject.setSeverity(Severity.ERROR.getValue());
		}
		return resultObject;
	}

}
