package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.demo2.service.GreetingService;
import com.example.demo2.service.GreetingServiceImpl;

@Controller
public class GetterInjectedController {
	
	private GreetingService greetingService;
	
public String sayHello() {
		
		return greetingService.sayHello();
	}
@Autowired
@Qualifier("getterGreetingServiceImpl")
public void setGreetingService(GreetingService gs)
{
this.greetingService =gs;	
}

}
