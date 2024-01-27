package com.durgasoft.beans;

public class DataBaseClass {
	private String driverClass;
	private String driverURL;
	private String dbUserName;
	private String dbPassword;
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getDriverURL() {
		return driverURL;
	}
	public void setDriverURL(String driverURL) {
		this.driverURL = driverURL;
	}
	public String getDbUserName() {
		return dbUserName;
	}
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}
	public String getDbPassword() {
		return dbPassword;
	}
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
	public void displayDBDetails() {
		System.out.println("DataBase Details");
		System.out.println("--------------------------------------");
		System.out.println("Driver class name: "+driverClass);
		System.out.println("Driver URL: "+driverURL);
		System.out.println("DataBase username: "+dbUserName);
	}
}
