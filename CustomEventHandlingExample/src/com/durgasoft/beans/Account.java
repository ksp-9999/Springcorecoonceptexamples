package com.durgasoft.beans;

import com.durgasoft.publisher.AccountEventPublisher;

public class Account {
	private AccountEventPublisher publisher;
	public void setPublisher(AccountEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	
	public void createAccount() {
		System.out.println("Account created");
		publisher.publish("account created");
	}
	public void searchAccount() {
		System.out.println("Account searched");
		publisher.publish("account searched");
	}
	public void updateAccount() {
		System.out.println("Account updated");
		publisher.publish("account updated");
	}
	public void deleteAccount() {
		System.out.println("Account deleted");
		publisher.publish("account deleted");
	}
	
}
