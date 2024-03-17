package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collection/colconfigxml.xml");
		Teacher teacher1 = (Teacher)context.getBean("teacher1");
		System.out.println(teacher1);
	}
}