package com.durgasoft.beans;

public class Student {
	 static {
		System.out.println("Student class loaded");
	}
	private String sname;
	private String Sid;
	private String Saddr;
	public Student() {
		System.out.println("Student object instantiated");
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("sname is instantiated with+ "+sname);
		this.sname = sname;
	}
	public String getSid() {
		return Sid;
	}
	public void setSid(String sid) {
		System.out.println("sid is instantiated with+ "+sid);
		Sid = sid;
	}
	public String getSaddr() {
		return Saddr;
	}
	public void setSaddr(String saddr) {
		System.out.println("saddr is instantiated with+ "+saddr);
		Saddr = saddr;
	}
	
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("---------------------------------");
		System.out.println("Student ID: "+ this.Sid);
		System.out.println("Student Name: "+this.sname);
		System.out.println("Student Address: "+this.Saddr);
	}
}
