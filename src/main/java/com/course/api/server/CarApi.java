package com.course.api.server;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.entity.Car;
import com.course.service.CarService;

@RestController
@RequestMapping(value = "/api/car/v1")
public class CarApi {
	
	private static final Logger LOG = LoggerFactory.getLogger(CarApi.class);
	
	@Autowired
	private CarService carService;
	
	@GetMapping(value = "/random", produces = MediaType.APPLICATION_JSON_VALUE)
	public Car getRandomCar() {
		return carService.generateCar();
	}
	
	@PostMapping(value = "/echo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String postACar(@RequestBody Car car) {
		LOG.info("car is {}", car);
		return car.toString();
	}
	
	@GetMapping(value = "/random-cars", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Car> getRandomCars() {
		var cars = new ArrayList<Car>();
		for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, 10); i++) {
			cars.add(carService.generateCar());
		}
		return cars;
	}
}
