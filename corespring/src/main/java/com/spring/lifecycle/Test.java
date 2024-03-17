package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
		Dell d = (Dell)context.getBean("dell");
		System.out.println(d);
	}
	
}
