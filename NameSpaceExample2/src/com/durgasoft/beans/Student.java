package com.durgasoft.beans;

public class Student {
	private String sid;
	private String sname;
	private String saddr;
	private Course scourse;
	
	public Student(String sid, String sname, String saddr, Course scourse) {
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
		this.scourse=scourse;
	}
	
	public void getStudentDetails() {
		System.out.println("**********Student Details*************");
		System.out.println("Id:"+sid);
		System.out.println("Name:"+sname);
		System.out.println("Address:"+saddr);
		System.out.println("Course:"+scourse.getCname());
		System.out.println("Course cost:"+scourse.getCcost());
	}
	
	
}
