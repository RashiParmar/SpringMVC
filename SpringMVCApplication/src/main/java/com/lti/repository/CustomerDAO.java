package com.lti.repository;

import org.springframework.stereotype.Repository;

import com.lti.model.Customer;

@Repository
public class CustomerDAO {
	public boolean registerCustomer(Customer c) {
		
		System.out.println("Customer (from DAO) - "+c);
		
		return false;
	}
}