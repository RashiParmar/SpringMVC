package com.lti.model;

public class Customer {
	private int custid;
	private String name, city;
	
	

	public Customer() {
		super();
	}

	public Customer(int custid, String name, String city) {
		super();
		this.custid = custid;
		this.name = name;
		this.city = city;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", city=" + city + "]";
	}

}