package com.example.demo2.service;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingServiceImpl implements GreetingService{

public String sayHello() {
		
		//System.out.println("hello");
		return "Hello - from GetterGreetingServiceImpl";
	}
}
