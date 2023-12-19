package com.durgasoft.beans;

public class Employee {
	private String empid;
	private String empname;
	private float empsal;
	private Account empacc;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getEmpsal() {
		return empsal;
	}
	public void setEmpsal(float empsal) {
		this.empsal = empsal;
	}
	public Account getEmpacc() {
		return empacc;
	}
	public void setEmpacc(Account empacc) {
		this.empacc = empacc;
	}
	
}
