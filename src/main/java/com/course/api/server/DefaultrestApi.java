package com.course.api.server;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DefaultrestApi {
	
	private Logger LOG = LoggerFactory.getLogger(DefaultrestApi.class);

	@GetMapping(value = "/welcome")
	public String welcome() {
		LOG.info("someone requested welcome api !");
		return "Welcome to Spring Rest API !";
	}
	
	@GetMapping(value = "/time")
	public String time() {
		return LocalTime.now().toString();
	}
}
