package com.course.service;

import java.util.List;

import com.course.entity.Car;

public interface CarService {
	List<String> BRANDS = List.of("Toyota", "Honda", "Ford");
	List<String> COLORS = List.of("Red", "Black", "White");
	List<String> TYPES = List.of("Sedan", "SUV", "MPV");
	List<String> ADDITIONAL_FEATURES = List.of("GPS", "Alarm", "Sunroof", "Media player", "Leather seats");
	
	Car generateCar();
}
