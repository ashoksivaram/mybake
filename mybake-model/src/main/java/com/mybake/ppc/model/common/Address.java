package com.mybake.ppc.model.common;

public class Address {
	private String addressType;
	private String address;
	private boolean isDeleted = false;

	public Address() {

	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted() {
		this.isDeleted = true;
	}
}
