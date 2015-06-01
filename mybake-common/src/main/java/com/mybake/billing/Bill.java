package com.mybake.billing;

import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Bill {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private Integer guid;
	
	@Persistent
	private Integer customer_num;
	
	@Persistent
	private Integer bill_number;
	
	@Persistent
	private Integer outlet_number;
	
	@Persistent
	private String created_by;
	
	@Persistent
	private Date created_date;
	
	@Persistent
	private double tax_amount;
	
	@Persistent
	private double total_amount;
	
	@Persistent
	private double advance_amount;
	
	@Persistent
	private double balance_amount;
	  
	@Persistent
	private Enum type_of_payment;
	
	@Persistent
	private List<ItemizedBill> itemized_bills;

	public Integer getCustomer_num() {
		return customer_num;
	}

	public Integer getGuid() {
		return guid;
	}

	public void setGuid(Integer guid) {
		this.guid = guid;
	}

	public void setCustomer_num(Integer customer_num) {
		this.customer_num = customer_num;
	}

	public Integer getBill_number() {
		return bill_number;
	}

	public void setBill_number(Integer bill_number) {
		this.bill_number = bill_number;
	}

	public Integer getOutlet_number() {
		return outlet_number;
	}

	public void setOutlet_number(Integer outlet_number) {
		this.outlet_number = outlet_number;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public double getTax_amount() {
		return tax_amount;
	}

	public void setTax_amount(double tax_amount) {
		this.tax_amount = tax_amount;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public double getAdvance_amount() {
		return advance_amount;
	}

	public void setAdvance_amount(double advance_amount) {
		this.advance_amount = advance_amount;
	}

	public double getBalance_amount() {
		return balance_amount;
	}

	public void setBalance_amount(double balance_amount) {
		this.balance_amount = balance_amount;
	}

	public Enum getType_of_payment() {
		return type_of_payment;
	}

	public void setType_of_payment(Enum type_of_payment) {
		this.type_of_payment = type_of_payment;
	}

	public List<ItemizedBill> getItemized_bills() {
		return itemized_bills;
	}

	public void setItemized_bills(List<ItemizedBill> itemized_bills) {
		this.itemized_bills = itemized_bills;
	}

}
