package com.durgasoft.beans;

public class HelloBean {
	static {
		System.out.println("HelloBean class loaded");
	}
	public HelloBean() {
		System.out.println("HelloBean object created");
	}
	public String sayHello() {
		return "Hello! user";
	}
}
