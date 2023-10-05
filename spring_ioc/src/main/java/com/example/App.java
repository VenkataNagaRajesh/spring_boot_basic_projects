package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	Student abhi=context.getBean("student",Student.class);
    	abhi.displayStudentInfo();
//    	Student abhi1=context.getBean("student1",Student.class);
//    	abhi1.displayStudentInfo();
    }
}
