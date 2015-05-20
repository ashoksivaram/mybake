package com.mybake.ppc.html.app.model.repo.imp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mybake.ppc.html.app.model.repo.imp.BillRepoImp;

public class BillRepoImpTest {
	

	@Test
	public void test() {
		BillRepoImp billRepoImp = new BillRepoImp();
		Integer newBillerNumber = billRepoImp.getNewBillerNumber();
		assertNotNull(newBillerNumber);
		// assertTrue(newBillerNumber.compareTo(133436965) == 0);
	}
}
