package com.course;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrestApplication.class, args);
		System.out.println(StringUtils.join("SALAM","..."));
	}

}
