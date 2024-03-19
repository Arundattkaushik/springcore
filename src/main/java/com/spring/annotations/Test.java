package com.spring.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/annotations/annotations.xml");
		context.registerShutdownHook();
		Candidate candidate = (Candidate) context.getBean("candidate");
		System.out.println(candidate);
	}
}
