package com.durgasoft.beans;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String sid;
	private String sname;
	private Address saddr;
	private List<String> qualifications;
	private Set<String> scourses;
	private Map<String,String> scourses_and_faculty;
	private Properties course_and_cost;
	
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
	public Address getSaddr() {
		return saddr;
	}
	public void setSaddr(Address saddr) {
		this.saddr = saddr;
	}
	public List<String> getQualifications() {
		return qualifications;
	}
	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}
	public Set<String> getScourses() {
		return scourses;
	}
	public void setScourses(Set<String> scourses) {
		this.scourses = scourses;
	}
	public Map<String,String> getScourses_and_faculty() {
		return scourses_and_faculty;
	}
	public void setScourses_and_faculty(Map<String,String> scourses_and_faculty) {
		this.scourses_and_faculty = scourses_and_faculty;
	}
	public Properties getCourse_and_cost() {
		return course_and_cost;
	}
	public void setCourse_and_cost(Properties course_and_cost) {
		this.course_and_cost = course_and_cost;
	}
	public void getStudentDetails() {
		System.out.println("*****************Student Details*********************");
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+sname);
		System.out.println("Qualifications: "+qualifications);
		System.out.println("Student courses and faculty: "+scourses_and_faculty);
		System.out.println("Courses Enrolled: "+scourses);
		System.out.println("Courses cost: "+course_and_cost);
		System.out.println("--------------------------");
		saddr.getAddress();
	}
	
}
