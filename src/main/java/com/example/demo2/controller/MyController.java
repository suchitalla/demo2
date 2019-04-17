package com.example.demo2.controller;

import org.springframework.stereotype.Controller;

import com.example.demo2.service.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}

	public String hello()
	{
		//System.out.println("Hello");
		return greetingService.sayHello();
	}
}
