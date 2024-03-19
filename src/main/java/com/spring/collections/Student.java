package com.spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String studnetName;
	private List<String> phoneNumber;
	private Set<String> studentAddress;
	private Map<String, String> courseCompleted;
	
	public Student() {
		super();
	}
	
	public Student(String studnetName, List<String> phoneNumber, Set<String> studentAddress,
			Map<String, String> courseCompleted) {
		super();
		this.studnetName = studnetName;
		this.phoneNumber = phoneNumber;
		this.studentAddress = studentAddress;
		this.courseCompleted = courseCompleted;
	}
	
	public String getStudnetName() {
		return studnetName;
	}
	public void setStudnetName(String studnetName) {
		this.studnetName = studnetName;
	}
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Set<String> getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Set<String> studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Map<String, String> getCourseCompleted() {
		return courseCompleted;
	}
	public void setCourseCompleted(Map<String, String> courseCompleted) {
		this.courseCompleted = courseCompleted;
	}

	@Override
	public String toString() {
		return "Student [studnetName=" + studnetName + ", phoneNumber=" + phoneNumber + ", studentAddress="
				+ studentAddress + ", courseCompleted=" + courseCompleted + "]";
	}
}
