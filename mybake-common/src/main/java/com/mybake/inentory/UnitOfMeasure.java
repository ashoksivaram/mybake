package com.mybake.inentory;


public enum UnitOfMeasure {

	KG("KG"),

	COUNT("COUNT");

	private final String name;

	private UnitOfMeasure(String value) {
		name = value;
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return name;
	}

}
