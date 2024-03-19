package com.spring.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standalonecollections/standalonecollections.xml");
		Student student = (Student)context.getBean("studentCollection");
		System.out.println(student);
	}

}
