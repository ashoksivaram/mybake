package com.mybake.ppc.html.app.controller.requesthandler;

import com.mybake.poc.html.uiobjects.ResultObject;

public interface RequestHandler {

	/**
	 * Handle request.
	 * 
	 * @param param the param
	 * @return the result object
	 */
	ResultObject handleRequest(Object param);

	/**
	 * Handle request.
	 * 
	 * @return the result object
	 */
	ResultObject handleRequest();

	/**
	 * Handle request.
	 *
	 * @param value the value
	 * @return the result object
	 */
	ResultObject handleRequest(String value);
}
