package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.demo2.service.GreetingService;

@Controller
public class ConstructorInjectedController {

private GreetingService greetingService;


public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl")GreetingService greetingService) {
	super();
	this.greetingService = greetingService;
}

public String sayHello() {
	
	return greetingService.sayHello();
}

}
