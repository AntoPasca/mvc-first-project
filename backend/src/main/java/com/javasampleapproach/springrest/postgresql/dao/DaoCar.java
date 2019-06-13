package com.javasampleapproach.springrest.postgresql.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.springrest.postgresql.model.CarModel;

public interface DaoCar extends CrudRepository<CarModel,Long>{
	
	List<CarModel> findByModel(String model);
	
	List<CarModel> findByTarga(String targa);
	
	List<CarModel> findByCilindrata(int cilindrata);
}
