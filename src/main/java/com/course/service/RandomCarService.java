package com.course.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.course.entity.Car;
import com.course.utils.RandomDateUtil;

@Service
public class RandomCarService implements CarService{

	@Override
	public Car generateCar() {
		var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(0, BRANDS.size()));
		var color = COLORS.get(ThreadLocalRandom.current().nextInt(0, COLORS.size()));
		var type = TYPES.get(ThreadLocalRandom.current().nextInt(0, TYPES.size()));
		
		var price = ThreadLocalRandom.current().nextInt(5000, 12001);
		var available = ThreadLocalRandom.current().nextBoolean();
		var firstReleaseDate = RandomDateUtil.generateRandomLocalDate();
		
		var randomCount = ThreadLocalRandom.current().nextInt(ADDITIONAL_FEATURES.size());
		var additionalFeatures = new ArrayList<String>();
		for (int i = 0; i < randomCount; i++) {
			additionalFeatures.add(ADDITIONAL_FEATURES.get(i));
		}
		
		var result = new Car(brand, color, type, price, available, firstReleaseDate);
		result.setAdditionalFeatures(additionalFeatures);
		
		return result;
	}
	
}
