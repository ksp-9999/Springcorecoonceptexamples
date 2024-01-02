package com.durgasoft.beans;

public class SavingsAccount implements Account{
	@Override
	public void createAccount() {
		System.out.println("Account created");
	}
	@Override
	public void searchAccount() {
		System.out.println("account searched");
	}
	@Override
	public void deleteAccount() {
		System.out.println("Account deleted");
	}
	@Override
	public void updateAccount() {
		System.out.println("Account updated");
	}
}
