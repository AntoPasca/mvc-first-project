package com.javasampleapproach.springrest.postgresql.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasampleapproach.springrest.postgresql.dao.DaoCar;
import com.javasampleapproach.springrest.postgresql.dto.Car;
import com.javasampleapproach.springrest.postgresql.model.CarModel;

@Service
public class CarServiceImpl implements CarService {
	private static final Logger logger = LoggerFactory.getLogger(CarService.class);

	@Autowired
	DaoCar daoCar;
	
	@Autowired
	Validator validator;

	public List<Car> getAllCar() {
		List<CarModel> carsOut = new ArrayList<>();
		daoCar.findAll().forEach(carsOut::add);
		List<Car> cars = new ArrayList<>();
		for (int i = 0; i < carsOut.size(); i++) {
			cars.add(new Car());
			BeanUtils.copyProperties(carsOut.get(i), cars.get(i));
			logger.info(cars.get(i).toString());
		}
		return cars;
	}
	
	public Car createCar(Car car) {
		Set<ConstraintViolation<Car>> violations = validator.validate(car);
		if (violations.isEmpty()) {
			CarModel carOut = new CarModel();
			BeanUtils.copyProperties(car, carOut);
			daoCar.save(carOut);
			BeanUtils.copyProperties(carOut, car);
			return car;
		} else {
			for (ConstraintViolation<Car> violation : violations) {
				logger.error(violation.getMessage());
			}
			return null;
		}

	}

	public Long deleteCar(long id) {
		logger.debug("Eliminazione auto id: " + id);
		daoCar.deleteById(id);
		return id;
	}

	public void deleteAllCar() {
		logger.debug("Eliminazione di tutte le auto");
		daoCar.deleteAll();
	}

	public List<Car> findByModel(String model) {
		List<CarModel> carsOut = daoCar.findByModel(model);
		List<Car> cars = new ArrayList<>();
		for (int i = 0; i < carsOut.size(); i++) {
			cars.add(new Car());
			BeanUtils.copyProperties(carsOut.get(i), cars.get(i));
			logger.info(cars.get(i).toString());
		}
		return cars;
	}

	public List<Car> findByTarga(String targa) {
		List<CarModel> carsOut = daoCar.findByTarga(targa);
		logger.debug(carsOut.toString());
		List<Car> cars = new ArrayList<>();
		for (int i = 0; i < carsOut.size(); i++) {
			cars.add(new Car());
			BeanUtils.copyProperties(carsOut.get(i), cars.get(i));
			logger.info(cars.get(i).toString());
		}
		return cars;
	}

	public List<Car> findByCilindrata(int cilindrata) {
		List<CarModel> carsOut = daoCar.findByCilindrata(cilindrata);
		List<Car> cars = new ArrayList<>();
		for (int i = 0; i < carsOut.size(); i++) {
			cars.add(new Car());
			BeanUtils.copyProperties(carsOut.get(i), cars.get(i));
			logger.info(cars.get(i).toString());
		}
		return cars;
	}

	public Car updateCar(long id, Car car) {
		logger.info("Modifiche da fare: " + car.toString());
		Set<ConstraintViolation<Car>> violations = validator.validate(car);
		if (violations.isEmpty()) {
			Optional<CarModel> carData = daoCar.findById(id);
			if (carData.isPresent()) {
				Car carOut = new Car();
				CarModel carIn = carData.get();
				carIn.setModel(car.getModel());
				carIn.setTarga(car.getTarga());
				carIn.setCilindrata(car.getCilindrata());
				carIn = daoCar.save(carIn);
				BeanUtils.copyProperties(carIn, carOut);
				logger.debug("Update Car with ID = " + id + "...");
				return carOut;
			} else
				return null;
		} else {
			for (ConstraintViolation<Car> violation : violations) {
				logger.error(violation.getMessage());
			}
			return null;
		}
	}
}
