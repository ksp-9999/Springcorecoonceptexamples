package com.durgasoft.beans;

public class HelloBean {
	static {
		System.out.println("HelloBean class loaded");
	}
//	public HelloBean() {
//		System.out.println("HelloBean object created");
//	}
	public String sayHello() {
		return "Hello! user";
	}
	
//	public static HelloBean getInstance() {
//		System.out.println("HelloBean factory method called");
//		return new HelloBean();
//	}
}
