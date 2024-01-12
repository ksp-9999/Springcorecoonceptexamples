package com.durgasoft.beans;

public class Course {
	private String cid;
	private String cname;
	private float ccost;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getCcost() {
		return ccost;
	}
	public void setCcost(float ccost) {
		this.ccost = ccost;
	}
	
	public void getCourseDetails() {
		System.out.println("----------------------course details--------------------------");
		System.out.println("Course Name:"+cname);
		System.out.println("Course Cost:"+ccost);
	}
}
