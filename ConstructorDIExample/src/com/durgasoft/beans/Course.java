package com.durgasoft.beans;

public class Course {
	private String cid;
	private String cname;
	private float ccost;
	public Course() {
		
	}
	public Course(String cid) {
		this.cid=cid;
	}
	public Course(String cid,String cname) {
		this.cid=cid;
		this.cname=cname;
	}
	public Course(String cid,String cname,float ccost) {
		this.cid=cid;
		this.cname=cname;
		this.ccost=ccost;
	}
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
	public void getCourseDetails(){
		System.out.println("*******************Course Details*****************");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Course Id: "+cid);
		System.out.println("Course Name: "+cname);
		System.out.println("Course Cost: "+ccost);
		 
		
	}
}
