package com.durgasoft.beans;

public class Employee {
	private String ename;
	private EmpAddress eaddr;
	private int eno;
	private float esal;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public EmpAddress getEaddr() {
		return eaddr;
	}
	public void setEaddr(EmpAddress eaddr) {
		this.eaddr = eaddr;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------------------------------------");
		System.out.println("Employee no: "+eno);
		System.out.println("Employee name: "+ename);
		System.out.println("Employee salary: "+esal);
		System.out.println("Employee Address Details: ");
		System.out.println();
		eaddr.getAddress();
	}
}
