package com.spring.ci;

public class StudentInfo {
	private String lastName;

	public StudentInfo(String lastName) {
		super();
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "StudentInfo [lastName=" + lastName + "]";
	}
}
