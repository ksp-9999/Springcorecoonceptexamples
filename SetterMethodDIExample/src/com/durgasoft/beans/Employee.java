package com.durgasoft.beans;

public class Employee {
	private String eid;
	private String ename;
	private String eaddr;
	private float esal;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("--------------------------------");
		System.out.println("Employee Id: "+eid);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee salary: "+esal);
		System.out.println("Employee Address: "+eaddr);
	}
}
