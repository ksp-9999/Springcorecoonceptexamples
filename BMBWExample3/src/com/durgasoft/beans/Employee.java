package com.durgasoft.beans;

public class Employee {
	private String eno;
	private String ename;
	private String eaddr;
	private float esal;
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
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
		System.out.println("---------------Employee Details----------");
		System.out.println("Emp No: "+eno);
		System.out.println("Emp Name: "+ename);
		System.out.println("Emp salary: "+esal);
		System.out.println("Emp addr: "+eaddr);
	}
}
