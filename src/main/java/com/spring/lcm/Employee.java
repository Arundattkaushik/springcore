package com.spring.lcm;

public class Employee {
	private String empName;

	public Employee() {
		super();
	}

	public Employee(String empName) {
		super();
		this.empName = empName;
	}
	
	public void helloInit() {
		System.out.println("Hello Init method");
	}
	
	public void helloDestroy() {
		System.out.println("Bye destroy method");
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + "]";
	}
}
