package com.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Candidate {

	private String candidateName;

	public Candidate(String candidateName) {
		super();
		this.candidateName = candidateName;
	}

	@PostConstruct
	public void helloInit() {
		System.out.println("Hello init method");
	}
	
	@PreDestroy
	public void helloDestroy() {
		System.out.println("Hello Destroy method");
	}
	
	@Override
	public String toString() {
		return "Candidate [candidateName=" + candidateName + "]";
	}
}
