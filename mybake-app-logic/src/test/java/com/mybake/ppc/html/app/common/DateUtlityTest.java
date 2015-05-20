package com.mybake.ppc.html.app.common;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mybake.ppc.html.app.common.DateUtlity;

public class DateUtlityTest {

	@Test
	public void testGetCurrentDate() {
		// assertEquals("Sun 12-Apr-2015", DateUtlity.getCurrentDate());
		assertNotNull(DateUtlity.getCurrentDate());

		// assertEquals("07:32 PM", DateUtlity.getCurrentTime());
		assertNotNull(DateUtlity.getCurrentDate());

	}

}
