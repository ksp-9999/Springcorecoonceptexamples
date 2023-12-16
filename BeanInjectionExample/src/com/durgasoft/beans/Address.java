package com.durgasoft.beans;

public class Address {
	private String houseNo;
	private String street;
	private String district;
	private String state;
	private String country;
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void getAddress() {
		System.out.println("Student Address:");
		System.out.println("House No: "+houseNo);
		System.out.println("Street: "+street);
		System.out.println("district: "+district);
		System.out.println("State "+state);
		System.out.println("Country "+country);
		
	}
}
