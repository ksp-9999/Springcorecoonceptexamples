package com.durgasoft.beans;

public class Employee {
	private String eid;
	private String eName;
	private float eSal;
	private Account account;
	private Address address;
	
	public Employee(String eid,String eName,float eSal,Account account,Address address) {
		this.eid=eid;
		this.eName=eName;
		this.eSal=eSal;
		this.account=account;
		this.address=address;
	}
//	public Account getAccount() {
//		return account;
//	}
//	public void setAccount(Account account) {
//		this.account = account;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	public String getEid() {
//		return eid;
//	}
//	public void setEid(String eid) {
//		this.eid = eid;
//	}
//	public String geteName() {
//		return eName;
//	}
//	public void seteName(String eName) {
//		this.eName = eName;
//	}
//	public float geteSal() {
//		return eSal;
//	}
//	public void seteSal(float eSal) {
//		this.eSal = eSal;
//	}
//	
	
	public void getEmpDetails() {
		System.out.println("*********Employee Details**************");
		System.out.println("ID: "+eid);
		System.out.println("Name: "+eName);
		System.out.println("Salary: "+eSal);
		System.out.println();
		System.out.println("Address");
		System.out.println("House No: "+address.getHno());
		System.out.println("Street: "+address.getStreet());
		System.out.println("State: "+address.getState());
		System.out.println("PIN: "+address.getPincode());
		System.out.println();
		System.out.println("Account Details");
		System.out.println("No: "+account.getAccNo());
		System.out.println("Name: "+account.getAccName());
		System.out.println("Type: "+account.getAccType());
		System.out.println("Balance: "+account.getAccBal());
		System.out.println("-----------------------------The End-----------------------------");
		
	}
}
