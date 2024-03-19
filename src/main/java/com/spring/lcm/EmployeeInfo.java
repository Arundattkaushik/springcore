package com.spring.lcm;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeInfo implements InitializingBean,DisposableBean {

	private String empDOJ;

	public EmployeeInfo(String empDOJ) {
		super();
		this.empDOJ = empDOJ;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [empDOJ=" + empDOJ + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After class property set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy code method invoked");
		
	}
}
