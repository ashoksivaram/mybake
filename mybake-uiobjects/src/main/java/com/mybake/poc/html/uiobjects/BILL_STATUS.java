package com.mybake.poc.html.uiobjects;

public enum BILL_STATUS {

	/** The genre. */
	RELEASED("Released"),
	/** The par rating. */
	SAVED("Saved");

	/** The value. */
	private String value;

	/**
	 * Instantiates a new term type.
	 *
	 * @param typeValue the type value
	 */
	BILL_STATUS(String value) {
		this.setValue(value);

	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
