package com.cg.invitepeoplebe.service;

import com.cg.invitepeoplebe.bean.Customer;

public interface ICustomerService {

	Customer getCustomerById(String customer_email);
	public long getCode(Customer c);

}
