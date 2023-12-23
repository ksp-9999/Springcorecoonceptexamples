package com.durgasoft.beans;

public class Student {
	private String sid;
	private String sname;
	private String saddr;
	private Course scourse;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public Course getScourse() {
		return scourse;
	}
	public void setScourse(Course scourse) {
		this.scourse = scourse;
	}
	
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("ID: "+sid);
		System.out.println("Name: "+sname);
		System.out.println("Address: "+saddr);
		System.out.println("Course Details");
		System.out.println("Course Id: "+this.scourse.getCid());
		System.out.println("Name: "+this.scourse.getCname());
		System.out.println("Cost: "+this.scourse.getCcost());
	}
}
