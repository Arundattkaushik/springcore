package com.spring.ref;

public class B {
	private String bName;

	public B() {
		super();
	}

	public B(String bName) {
		super();
		this.bName = bName;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	@Override
	public String toString() {
		return "B [bName=" + bName + "]";
	}
}
