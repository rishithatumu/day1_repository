package com.programcreek.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.programcreek.helloworld.services.HelloWorldService;

public class Hello 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		String message = service.sayHello();
		System.out.println(message);
		service.setName("Spring Project");
		message = service.sayHello();
		System.out.println(message);
	}
}
