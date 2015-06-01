package com.mybake.billing;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class ItemizedBill {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private Integer item_number;

	@Persistent
	private Integer product_number;

	@Persistent
	private String product_name;

	@Persistent
	private Double quantity;

	@Persistent 
	private Double price;

	@Persistent
	private String currency;

	public Integer getItem_number() {
		return item_number;
	}

	public void setItem_number(Integer item_number) {
		this.item_number = item_number;
	}

	public Integer getProduct_number() {
		return product_number;
	}

	public void setProduct_number(Integer product_number) {
		this.product_number = product_number;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
