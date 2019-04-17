package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo2.controller.ConstructorInjectedController;
import com.example.demo2.controller.GetterInjectedController;
import com.example.demo2.controller.MyController;
import com.example.demo2.controller.PropertyInjectedController;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Demo2Application.class, args);
		MyController mycon = (MyController)ctx.getBean("myController");
		System.out.println(mycon.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
