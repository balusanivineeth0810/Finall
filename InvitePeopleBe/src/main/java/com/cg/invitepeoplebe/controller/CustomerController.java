package com.cg.invitepeoplebe.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.invitepeoplebe.bean.Customer;
import com.cg.invitepeoplebe.service.ICustomerService;

@RestController
public class CustomerController {

	@Autowired
	ICustomerService service;

	@RequestMapping("/getcode")
	public Customer getCustomerById(@RequestParam String customer_email) {

		Customer customer = service.getCustomerById(customer_email);

		return customer;

	}

}
