package com.durgasoft.beans;

public class HelloBean {
	private String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return "Hello "+this.name+" !";
	}
public String sayHello() {
	return this.getName();
}

}
