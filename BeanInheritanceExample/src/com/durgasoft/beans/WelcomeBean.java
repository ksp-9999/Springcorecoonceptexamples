package com.durgasoft.beans;

public class WelcomeBean {
	private String name;
	private String msg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void sayWelcome() {
		System.out.println("Welcome "+name+", "+msg);
	}
}
