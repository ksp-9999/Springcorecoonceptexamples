package com.durgasoft.beans;

public class Student {
	private String sid;
	private String sname;
	private String saddr;
	private Course stucourse;
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
	public Course getStucourse() {
		return stucourse;
	}
	public void setStucourse(Course stucourse) {
		this.stucourse = stucourse;
	}
	
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("Id: "+sid);
		System.out.println("Name: "+sname);
		System.out.println("Address: "+saddr);
		System.out.println("Course Details:");
		System.out.println("Id: "+this.stucourse.getCid());
		System.out.println("Name: "+this.stucourse.getCname());
		System.out.println("Cost: "+this.stucourse.getCcost());
		
	}
}
