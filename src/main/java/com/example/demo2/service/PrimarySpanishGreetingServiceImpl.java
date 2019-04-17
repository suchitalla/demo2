package com.example.demo2.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

	public String sayHello() {
		
		//System.out.println("hello");
		return "Hello - In Spanish primaryGreetingServiceImpl";
	}
	
}
