package com.spring.consinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/consinj/config.xml");
        Person person1 = (Person)context.getBean("person1");
        System.out.println(person1);
	}
}