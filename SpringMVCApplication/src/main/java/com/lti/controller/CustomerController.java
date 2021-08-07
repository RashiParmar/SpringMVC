package com.lti.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Customer;

@Controller
public class CustomerController {

	@RequestMapping("/registerCustomer.html")
	public ModelAndView viewRegister() {
		return new ModelAndView("register", "cust", new Customer());
	}

	@RequestMapping("/register")
	public ModelAndView registerCustomer(HttpServletRequest req, HttpServletResponse res,
			@ModelAttribute("cust") Customer cust) {
		System.out.println("Cust registered + " + cust);
		return new ModelAndView("home", "regCust", cust);
	}
}