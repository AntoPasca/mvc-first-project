package com.javasampleapproach.springrest.postgresql.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.springrest.postgresql.model.CustomerModel;

public interface DaoCustomer extends CrudRepository<CustomerModel, Long> {
		
	public List<CustomerModel> findByAge(int age);
	
	public List<CustomerModel> findByName(String name);
	
}
