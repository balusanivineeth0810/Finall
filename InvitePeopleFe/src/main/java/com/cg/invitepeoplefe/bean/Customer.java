package com.cg.invitepeoplefe.bean;

public class Customer {
	private String customer_email;

	private long customer_refcode;
	
	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public long getCustomer_refcode() {
		return customer_refcode;
	}

	public void setCustomer_refcode(long customer_refcode) {
		this.customer_refcode = customer_refcode;
	}

	public Customer() {

	}

	@Override
	public String toString() {
		return "Customer [customer_email=" + customer_email + ", customer_refcode=" + customer_refcode + "]";
	}

	public Customer(String customer_email, long customer_refcode) {
		super();
		this.customer_email = customer_email;
		this.customer_refcode = customer_refcode;
	}
}
