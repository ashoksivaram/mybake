package com.mybake.ppc.html.app.controller.builder;

import com.mybake.poc.html.uiobjects.JSNewBillInfo;
import com.mybake.ppc.html.app.model.repo.BillRepo;
import com.mybake.ppc.html.app.model.repo.ProductRepo;
import com.mybake.ppc.html.app.model.repo.UserRepo;

public interface CreateNewBillPageBuilder {

	boolean build(UserRepo userRepo, ProductRepo productRepo, BillRepo billrepo, String userId);

	/**
	 * Gets the result.
	 *
	 * @return the result
	 */
	JSNewBillInfo getResult();

}
