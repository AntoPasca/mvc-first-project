package com.javasampleapproach.springrest.postgresql.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javasampleapproach.springrest.postgresql.dao.DaoCustomer;
import com.javasampleapproach.springrest.postgresql.dto.Customer;
import com.javasampleapproach.springrest.postgresql.model.CustomerModel;


@Service
public class CustomerServiceImpl implements CustomerService {
	private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	DaoCustomer daoCustomer;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Transactional (readOnly = true)
	public List<Customer> getAllCustomers() {
		List<CustomerModel> customersOut = new ArrayList<>();
		daoCustomer.findAll().forEach(customersOut::add);
		List<Customer> customers = new ArrayList<>();
		for (int i = 0; i < customersOut.size(); i++) {
			customers.add(new Customer());
			BeanUtils.copyProperties(customersOut.get(i), customers.get(i));
			logger.info(customers.get(i).toString());
		}
		return customers;
	}
	
	@Transactional
	public Customer createCustomer(Customer customer) {
		String encodePassword = passwordEncoder.encode(customer.getPassword());
		CustomerModel customersOut = new CustomerModel();
		BeanUtils.copyProperties(customer, customersOut);
		customersOut = daoCustomer.save(customersOut);
		BeanUtils.copyProperties(customersOut , customer);
		logger.info(customer.toString());
		return customer;
	}
	
	public Long deleteCustomer(long id) {
		logger.debug("Eliminazione customer id: " + id);
		daoCustomer.deleteById(id);
		return id;
	}
	
	public void deleteAllCustomers() {
		logger.info("Delete All Customers...");
		daoCustomer.deleteAll();
	}
	
	public List<Customer> findByAge(int age) {
		List<CustomerModel> customersOut = daoCustomer.findByAge(age);
		List<Customer> customers = new ArrayList<>();
		for(int i=0; i<customersOut.size(); i++) {
			customers.add(new Customer());
			BeanUtils.copyProperties(customersOut.get(i), customers.get(i));
			logger.info(customers.get(i).toString());
		}
		return customers;
	}
	
	public List<Customer> findByName(String name) {
		List<CustomerModel> customersOut = daoCustomer.findByName(name);
		List<Customer> customers = new ArrayList<>();
		for(int i=0 ; i<customersOut.size() ; i++) {
			customers.add(new Customer());
			BeanUtils.copyProperties(customersOut.get(i), customers.get(i));
			logger.info(customers.get(i).toString());
		}
		return customers;
	}
	
	public Customer updateCustomer(long id,Customer customer) {

		Optional<CustomerModel> customerData = daoCustomer.findById(id);

		if (customerData.isPresent()) {
			Customer customerOut = new Customer();
			CustomerModel customerIn = customerData.get();
			customerIn.setName(customer.getName());
			customerIn.setAge(customer.getAge());
			customerIn.setActive(customer.isActive());
			customerIn.setPassowrd(customer.getPassword());
			customerIn = daoCustomer.save(customerIn);
			
			BeanUtils.copyProperties(customerIn, customerOut);
			return customerOut;
		}
		else return null;
	}
}
