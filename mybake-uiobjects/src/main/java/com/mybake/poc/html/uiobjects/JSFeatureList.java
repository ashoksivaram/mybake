package com.mybake.poc.html.uiobjects;

public class JSFeatureList {

	private boolean billing = false;
	private boolean purchase = false;
	private boolean reports = false;
	private boolean inventory = false;
	private boolean finance = false;

	public JSFeatureList() {

	}

	public boolean isBilling() {
		return billing;
	}

	public void setBilling(boolean billing) {
		this.billing = billing;
	}

	public boolean isPurchase() {
		return purchase;
	}

	public void setPurchase(boolean purchase) {
		this.purchase = purchase;
	}

	public boolean isReports() {
		return reports;
	}

	public void setReports(boolean reports) {
		this.reports = reports;
	}

	public boolean isInventory() {
		return inventory;
	}

	public void setInventory(boolean inventory) {
		this.inventory = inventory;
	}

	public boolean isFinance() {
		return finance;
	}

	public void setFinance(boolean finance) {
		this.finance = finance;
	}

}
