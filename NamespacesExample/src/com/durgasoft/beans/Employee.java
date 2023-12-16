package com.durgasoft.beans;

public class Employee {
	private String empId;
	private String empName;
	private String empSal;
	private Account empAcc;
	private String empAddr;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	public Account getEmpAcc() {
		return empAcc;
	}
	public void setEmpAcc(Account empAcc) {
		this.empAcc = empAcc;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	
	public void getEmpDetails() {
		System.out.println("***********Employee Details*****************");
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSal);
		System.out.println("Employee Address: "+empAddr);
		System.out.println("------Employee Account Details------");
		System.out.println("Employee Account Number:"+empAcc.getAccNo());
		System.out.println("Employee Account Balance:"+empAcc.getAccBal());
		System.out.println("Employee Account Type:"+empAcc.getAccType());
		
	}
}
