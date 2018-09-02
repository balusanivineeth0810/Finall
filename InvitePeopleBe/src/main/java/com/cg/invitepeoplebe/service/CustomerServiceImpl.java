package com.cg.invitepeoplebe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.invitepeoplebe.bean.Customer;
import com.cg.invitepeoplebe.repo.ICustomerRepo;



@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerRepo repo;

	@Override
	public Customer getCustomerById(String customer_email) {
		if(!repo.existsById(customer_email)) {
			Customer cust = new Customer();
			cust.setCustomer_email(customer_email);
			cust.setCustomer_refcode(genCode());
			repo.save(cust);
			}
			return repo.findById(customer_email).get();
	}

	private long genCode() {
		long ref= (long)(Math.random() * 10000 + 999999);
		return ref;
	}

	@Override
	public long getCode(Customer c) {
		return c.getCustomer_refcode();
	}

}
