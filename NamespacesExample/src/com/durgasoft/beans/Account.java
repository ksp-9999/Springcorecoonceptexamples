package com.durgasoft.beans;

public class Account {
	private String accNo;
	private String accName;
	private String accType;
	private float accBal;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public void getAccDetails() {
		System.out.println("------Account Details------");
		System.out.println("Account Number:"+accNo);
		System.out.println("Account Balance:"+accBal);
		System.out.println("Account Type:"+accType);
	}
}
