package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo2.service.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		
		return greetingService.sayHello();
	}
}
