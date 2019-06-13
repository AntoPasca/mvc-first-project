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

import com.javasampleapproach.springrest.postgresql.dto.Car;
import com.javasampleapproach.springrest.postgresql.service.CarServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CarController {
	
	@Autowired
	CarServiceImpl carService;
	
	@GetMapping("/cars")
	public List<Car> getAllCars(){
		return carService.getAllCar();
	}
	
	@PostMapping("/cars/create")
	public Long postCar(@RequestBody Car car) {
		return carService.createCar(car).getId();
	}
	
	@DeleteMapping("/cars/{id}")
	public void deleteCar(@PathVariable("id") long id){
		carService.deleteCar(id); 
	}
	
	@DeleteMapping("/cars/delete")
	public void deleteAll(){
		carService.deleteAllCar();
	}
	
	@GetMapping("/cars/model/{model}")
	public List<Car> findByModel(@PathVariable("model") String model){
		return carService.findByModel(model);
	}
	
	@GetMapping("/cars/targa/{targa}")
	public List<Car> findByTarga(@PathVariable("targa") String targa){
		return carService.findByTarga(targa);
	}
	
	@GetMapping("/cars/cilindrata/{cilindrata}")
	public List<Car> findByCilindrata(@PathVariable("cilindrata") int cilindrata){
		return carService.findByCilindrata(cilindrata);
	}
	
	@PutMapping("/cars/{id}")
	public Long updateCar(@PathVariable("id") long id, @RequestBody Car car){
		return carService.updateCar(id, car).getId();
	}
	
}
