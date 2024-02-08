package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.LoginDao;
import com.example.demo.Entities.Login;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class Rest {
	
	private static final Logger logger = LoggerFactory.getLogger(Rest.class);
	 
	@Autowired
	private LoginDao loginDao;
	
	@GetMapping("/hw")
	String hw() {
		logger.info("Hello world!!!");
		return "Hello world";
	}
	
	@GetMapping("/getLoginInfo")
	List<Login> logInf() {
		logger.info("/getLoginInfo is called");
		return loginDao.findAll();
		//return null;
	}
}
