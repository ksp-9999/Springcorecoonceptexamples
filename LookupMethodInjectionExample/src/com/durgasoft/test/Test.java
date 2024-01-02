package com.durgasoft.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.CurrentAccount;
import com.durgasoft.beans.SavingsAccount;
import com.durgasoft.factory.AccountFactory;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgasoft/resources/applicationContext.xml");
		AccountFactory saf= (AccountFactory) context.getBean("savingsAccountFactory");
		SavingsAccount sa= (SavingsAccount) saf.getAccount();
		sa.createAccount();
		sa.searchAccount();
		sa.updateAccount();
		
		AccountFactory caf= (AccountFactory) context.getBean("currentAccountFactory");
		CurrentAccount ca=(CurrentAccount) caf.getAccount();
		ca.createAccount();
		ca.searchAccount();
		ca.updateAccount();
		ca.deleteAccount();
	}

}
