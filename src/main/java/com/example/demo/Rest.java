package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class Rest {
	
	 private static final Logger logger = LoggerFactory.getLogger(Rest.class);
	
	@GetMapping("/hw")
	String hw() {
		logger.info("Hello world!!!");
		return "Hello world";
	}
}
