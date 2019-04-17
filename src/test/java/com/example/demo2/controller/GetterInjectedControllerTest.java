package com.example.demo2.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.demo2.service.GreetingServiceImpl;

public class GetterInjectedControllerTest {

private GetterInjectedController pic;
	
	@Before
	public void setUp() throws Exception
	{
		pic = new GetterInjectedController();
		pic.setGreetingService(new GreetingServiceImpl());
		
	}
	
	@Test
	public void testGreeting()
	{
		assertEquals(GreetingServiceImpl.HELLO_GURUS,pic.sayHello());
	}
}
