package com.mybake.inentory;


public enum Type {

	RAW("RAW"),

	FINISHED("FINISHED");

	private final String name;

	private Type(String value) {
		name = value;
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return name;
	}

}
