package com.mybake.persistence;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class PersistenceManagerFactoryImpl {

	private static final PersistenceManagerFactory pmfInstance = JDOHelper
			.getPersistenceManagerFactory("transactions-optional");

	private PersistenceManagerFactoryImpl() {
	}

	public static PersistenceManagerFactory get() {
		return pmfInstance;
	}
}
