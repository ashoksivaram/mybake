package com.mybake.ppc.model.common;

public class PhoneNumber {
	private String type;
	private String number;
	private boolean isDeleted = false;

	public PhoneNumber() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted() {
		this.isDeleted = true;
	}

}
