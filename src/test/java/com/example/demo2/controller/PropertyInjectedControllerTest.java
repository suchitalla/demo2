package com.example.demo2.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.demo2.service.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController pic;
	
	@Before
	public void setUp() throws Exception
	{
		pic = new PropertyInjectedController();
		pic.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting()
	{
		assertEquals(pic.greetingService.HELLO_GURUS,pic.sayHello());
	}
	
}
