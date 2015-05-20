package com.mybake.ppc.html.app.controller.builder.imp;

import com.mybake.poc.html.uiobjects.BILL_STATUS;
import com.mybake.poc.html.uiobjects.JSNewBillInfo;
import com.mybake.poc.html.uiobjects.JSUserInfo;
import com.mybake.ppc.html.app.common.AppLogManager;
import com.mybake.ppc.html.app.common.DateUtlity;
import com.mybake.ppc.html.app.controller.builder.CreateNewBillPageBuilder;
import com.mybake.ppc.html.app.model.repo.BillRepo;
import com.mybake.ppc.html.app.model.repo.ProductRepo;
import com.mybake.ppc.html.app.model.repo.UserRepo;

public class CreateNewBillPageBuilderImp implements CreateNewBillPageBuilder {

	private JSNewBillInfo jsNewBillInfo = null;

	public boolean build(UserRepo userRepo, ProductRepo productRepo, BillRepo billrepo, String userId) {

		if (null != userRepo && null != productRepo) {
			JSUserInfo jsUserInfo = userRepo.getUserDetails(userId);
			if (null != jsUserInfo) {
				jsNewBillInfo = new JSNewBillInfo();
				jsNewBillInfo.setUserName(jsUserInfo.getUserName());

				jsNewBillInfo.setBillNumber(billrepo.getNewBillerNumber());

				jsNewBillInfo.setDate(DateUtlity.getCurrentDate());

				jsNewBillInfo.setTime(DateUtlity.getCurrentTime());

				// TODO should get from UserInfo or configuration
				jsNewBillInfo.setPlace("Bangalore");

				jsNewBillInfo.setStatus(BILL_STATUS.RELEASED.getValue());

				jsNewBillInfo.setTotalAmount((float) 0.0);

				jsNewBillInfo.setBillItems(productRepo.getAllProductInfo());
				return true;
			}
			else {
				AppLogManager.error("UnIdenfied user.");
				return false;
			}
		}
		return false;
	}

	public JSNewBillInfo getResult() {
		return jsNewBillInfo;
	}

}
