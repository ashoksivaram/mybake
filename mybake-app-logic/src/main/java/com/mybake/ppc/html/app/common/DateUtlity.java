package com.mybake.ppc.html.app.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtlity {

	public static String getCurrentDate() {
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd-MMM-yyyy");
		String format = simpleDateFormat.format(now);
		return format;
	}

	public static String getCurrentTime() {
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
		String format = simpleDateFormat.format(now);
		return format;
	}

}
