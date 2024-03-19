package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/collectionscfg.xml");
		Student student = (Student)context.getBean("studentCollection");
		System.out.println(student);
	}

}
