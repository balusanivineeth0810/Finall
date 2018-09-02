package com.cg.invitepeoplefe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.invitepeoplefe.bean.Customer;



@Controller
public class JspController {
	@RequestMapping("/Invite/{email}")
	public ModelAndView getCustomer(@PathVariable String email) {
		RestTemplate rt = new RestTemplate();
		Customer customer = rt.getForObject("http://localhost:9950/getcode?customer_email=" +email, Customer.class);
		return new ModelAndView("Invite", "obj",customer);
	}
	@RequestMapping("/")
	public String showInvite() {
		return "Invite";

	}
	
	@RequestMapping("Invite/Success")
	public String showSuccess() {
		return "Success";

	}
	
	@RequestMapping("/Success")
	public String showOops() {
		return "oops";

	}
}
