package com.spring.core.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_autowire.xml");
	Hello h1 = (Hello)context.getBean("hello");
	h1.displays();
	}
}
