package com.durgasoft.beans;

public class Employee {
	private String eid;
	private String ename;
	private float esal;
	private String eaddr;
	private Account eacc;
	
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
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public Account getEacc() {
		return eacc;
	}
	public void setEacc(Account eacc) {
		this.eacc = eacc;
	}
	
}
