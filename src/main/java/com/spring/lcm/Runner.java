package com.spring.lcm;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lcm/lcm.xml");
		EmployeeInfo employeeInfo = (EmployeeInfo) context.getBean("employeeInfo");
		System.out.println(employeeInfo);
	}

}
