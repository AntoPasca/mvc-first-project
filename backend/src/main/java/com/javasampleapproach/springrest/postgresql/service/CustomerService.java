package com.javasampleapproach.springrest.postgresql.service;

import java.util.List;

import com.javasampleapproach.springrest.postgresql.dto.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	
	public Customer createCustomer(Customer customer);
		
	public Long deleteCustomer(long id);
		
	public void deleteAllCustomers();
		
	public List<Customer> findByAge(int age);
		
	public List<Customer> findByName(String name);
		
	public Customer updateCustomer(long id,Customer customer);
}
