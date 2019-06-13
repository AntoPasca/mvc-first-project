package com.javasampleapproach.springrest.postgresql.service;

import java.util.List;

import com.javasampleapproach.springrest.postgresql.dto.Car;


public interface CarService {
	
	public List<Car> getAllCar();
	
	public Car createCar(Car car);
	
	public Long deleteCar(long id);
	
	public void deleteAllCar();
	
	public List<Car> findByModel(String model);
	
	public List<Car> findByTarga(String targa);
	
	public List<Car> findByCilindrata(int cilindrata);
	
	public Car updateCar(long id, Car car);
}
