package com.durgasoft.beans;

public class Employee {
	private String eid;
	private String eName;
	private float eSal;
	private Account eAcc;
	private Address eaddr;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float geteSal() {
		return eSal;
	}
	public void seteSal(float eSal) {
		this.eSal = eSal;
	}
	public Account geteAcc() {
		return eAcc;
	}
	public void seteAcc(Account eAcc) {
		this.eAcc = eAcc;
	}
	public Address getEaddr() {
		return eaddr;
	}
	public void setEaddr(Address eaddr) {
		this.eaddr = eaddr;
	}
	
	public void getEmpDetails() {
		System.out.println("*********Employee Details**************");
		System.out.println("ID: "+eid);
		System.out.println("Name: "+eName);
		System.out.println("Salary: "+eSal);
		System.out.println();
		System.out.println("Address");
		System.out.println("House No: "+eaddr.getHno());
		System.out.println("Street: "+eaddr.getStreet());
		System.out.println("State: "+eaddr.getState());
		System.out.println("PIN: "+eaddr.getPincode());
		System.out.println();
		System.out.println("Account Details");
		System.out.println("No: "+eAcc.getAccNo());
		System.out.println("Name: "+eAcc.getAccName());
		System.out.println("Type: "+eAcc.getAccType());
		System.out.println("Balance: "+eAcc.getAccBal());
		System.out.println("-----------------------------The End-----------------------------");
		
	}
}
