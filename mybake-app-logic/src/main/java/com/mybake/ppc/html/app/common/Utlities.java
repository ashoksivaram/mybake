package com.mybake.ppc.html.app.common;

import java.util.UUID;

public class Utlities {

	public static String getNewUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
}
