package com.example.demo2.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS="hello";
	
	public String sayHello() {
		
		//System.out.println("hello");
		return HELLO_GURUS;
	}
	
}
