package com.durgasoft.beans;

public class Account {
	private String ano;
	private String aHolderName;
	private float abal;
	private String atype;
	private String aemail;
	private String aHolderMobile;
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getaHolderName() {
		return aHolderName;
	}
	public void setaHolderName(String aHolderName) {
		this.aHolderName = aHolderName;
	}
	public float getAbal() {
		return abal;
	}
	public void setAbal(float abal) {
		this.abal = abal;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public String getaHolderMobile() {
		return aHolderMobile;
	}
	public void setaHolderMobile(String aHolderMobile) {
		this.aHolderMobile = aHolderMobile;
	}
	public void getAccDetails() {
		System.out.println("Account Details");
		System.out.println("------------------------------------");
		System.out.println("Account No: "+ano);
		System.out.println("Account Holder Name: "+aHolderName);
		System.out.println("Account Balance: "+abal);
		System.out.println("Account Type: "+atype);
		System.out.println("Account Holder email: "+aemail);
		System.out.println("Account Holder mobile: "+aHolderMobile);
		
	}
}
