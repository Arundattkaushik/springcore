package com.spring.steriotypeannotation;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class CandidateInfo {
	@Value("Arun")
	private String candidateName;
	
	@Value("#{phoneNumbers}")
	private List<String> phoneNumbers;

	@PostConstruct
	public void helloInit() {
		System.out.println("Hello init method");
	}
	
	@PreDestroy
	public void helloDestroy() {
		System.out.println("Hello Destroy method");
	}
	
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Candidate [candidateName=" + candidateName + "]";
	}
}
