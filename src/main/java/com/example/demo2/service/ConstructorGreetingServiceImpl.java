package com.example.demo2.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

public String sayHello() {
		
		//System.out.println("hello");
		return "Hello - from CosntructorGreetingServiceImpl";
	}
}
