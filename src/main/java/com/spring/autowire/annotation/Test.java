package com.spring.autowire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/annotation/autowirecfg.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}
}
