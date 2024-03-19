package com.spring.ci;

public class Person {
	private int personId;
	private String personName;
	private StudentInfo sInfo;
	
	public Person() {
		super();
	}

	public Person(int personId, String personName, StudentInfo sInfo) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.sInfo = sInfo;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", sInfo=" + sInfo + "]";
	}	
}
