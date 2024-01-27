package com.durgasoft.beans;


public class EmpAddress {
	private String Hno;
	private String Street;
	private String City;
	private String State;
	private String Country;
	
	public String getHno() {
		return Hno;
	}
	public void setHno(String hno) {
		Hno = hno;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public void getAddress() {
		System.out.println("--------Employee Address--------");
		System.out.println("House No: "+Hno);
		System.out.println("Street: "+Street);
		System.out.println("State: "+State);
		System.out.println("Country: "+Country);
	}
}
