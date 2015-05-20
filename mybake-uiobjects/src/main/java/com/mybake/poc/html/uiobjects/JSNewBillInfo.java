package com.mybake.poc.html.uiobjects;

import java.util.List;

public class JSNewBillInfo {

	private Integer billNumber;
	private String userName;
	private String place;
	private String status;
	private String date;
	private String time;
	private Float totalAmount;
	private List<JSProductInfo> billItems;

	public JSNewBillInfo() {

	}

	public Integer getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(Integer billNumber) {
		this.billNumber = billNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<JSProductInfo> getBillItems() {
		return billItems;
	}

	public void setBillItems(List<JSProductInfo> billItems) {
		this.billItems = billItems;
	}

}
