package com.durgasoft.beans;

public class User {
	private String uname;
	private String upswd;
	private int uage;
	private String ueamil;
	private String umobile;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpswd() {
		return upswd;
	}
	public void setUpswd(String upswd) {
		this.upswd = upswd;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public String getUeamil() {
		return ueamil;
	}
	public void setUeamil(String ueamil) {
		this.ueamil = ueamil;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	public void getUserDetails() {
		System.out.println("-----------------User Details------------------------");
		System.out.println("Name: "+uname);
		System.out.println("Age: "+uage);
		System.out.println("Email: "+ueamil);
		System.out.println("Mobile: "+umobile);
		
	}
}
