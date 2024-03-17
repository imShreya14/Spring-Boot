package com.myspring.myproject1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/myspring/myproject1/config.xml");
        
        Student student1 = (Student)context.getBean("student1");
        System.out.println(student1);
        Student student2 = (Student)context.getBean("student2");
        System.out.println(student2);
        Student student3 = (Student)context.getBean("student3");
        System.out.println(student3);
        System.out.println();
        
        Course course1 = (Course)context.getBean("course");
        System.out.println(course1);
    }
}
