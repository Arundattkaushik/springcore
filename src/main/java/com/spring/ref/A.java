package com.spring.ref;

public class A {
	private String name;
	private B ob;
	public A() {
		super();
	}
	public A(String name, B ob) {
		super();
		this.name = name;
		this.ob = ob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", ob=" + ob + "]";
	}
}
