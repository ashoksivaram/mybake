package com.mybake.ppc.html.app.model.repo.imp;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.mybake.ppc.html.app.model.repo.BillRepo;

@Component
public class BillRepoImp implements BillRepo {

	public Integer getNewBillerNumber() {
		// TODO Send the outletId to the DB to get billNumber
		// Billnumber shall be logic of outletId and some Range
		Random random = new Random();
		return random.nextInt();
	}

}
