package com.spring.steriotypeannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/steriotypeannotation/stereotypeconfig.xml");
		CandidateInfo candidate = context.getBean("ob", CandidateInfo.class);
		context.registerShutdownHook();
		System.out.println(candidate.getPhoneNumbers());
	}
}
