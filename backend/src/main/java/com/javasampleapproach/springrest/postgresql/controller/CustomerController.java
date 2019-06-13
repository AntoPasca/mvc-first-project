package com.javasampleapproach.springrest.postgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.postgresql.dto.Customer;
import com.javasampleapproach.springrest.postgresql.service.CustomerServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomers();
	}
	
	@PostMapping(value = "/customers/create")
	public Long createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer).getId();
	}
	

	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable("id") long id){
		customerService.deleteCustomer(id);
	}

	@DeleteMapping("/customers/delete")
	public void deleteAllCustomer(){
		customerService.deleteAllCustomers();
	}
	
	@GetMapping(value = "customers/age/{age}")
	public List<Customer> findByAge(@PathVariable("age") int age){
		return customerService.findByAge(age);
	}
	
	@GetMapping(value = "customers/name/{name}")
	public List<Customer> findByName(@PathVariable("name") String name){
		return customerService.findByName(name);
	}
	
	@PutMapping("/customers/{id}")
	public Customer updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer){
		return customerService.updateCustomer(id, customer);
		
	} 
}
