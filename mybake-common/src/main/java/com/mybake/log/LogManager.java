package com.mybake.log;

import org.apache.log4j.Logger;

public class LogManager {
	/**
	 * Unique instance of the log manager
	 */
	protected static final LogManager instance = new LogManager();

	/**
	 * The logger used for logging
	 */
	private static final Logger logger = Logger.getLogger("mybake");

	private static final Logger auditor = Logger.getLogger("AUDIT_mybake");

	/**
	 * Default constructor
	 */
	private LogManager() {

	}

	/**
	 * Returns the unique instance of this log manager
	 * 
	 * @return LogManager The unique instance
	 */
	public static LogManager getInstance() {
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
