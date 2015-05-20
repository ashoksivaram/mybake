package com.mybake.ppc.html.app.common;

import org.apache.log4j.Logger;

public class AppLogManager {
	/**
	 * Unique instance of the log manager
	 */
	protected static final AppLogManager instance = new AppLogManager();

	/**
	 * The logger used for logging
	 */
	private static final Logger logger = Logger.getLogger(StringConstants.HTML_SAMPLE);

	private static final Logger auditor = Logger.getLogger(StringConstants.AUDIT_HTML_SAMPLE);

	/**
	 * Default constructor
	 */
	private AppLogManager() {

	}

	/**
	 * Returns the unique instance of this log manager
	 * 
	 * @return LogManager The unique instance
	 */
	public static AppLogManager getInstance() {
		return instance;
	}

	public static void info(String message) {
		auditor.info(message);
	}

	public static void error(String message) {
		auditor.info(message);
	}

	public static void warning(String message) {
		auditor.warn(message);
	}

	public static void debug(String message) {
		logger.debug(message);
	}
}
