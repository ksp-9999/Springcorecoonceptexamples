package com.durgasoft.test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Account;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("com/durgasoft/resources/applicationContext.xml");
		Account acc= (Account) context.getBean("accountBean");
		acc.createAccount();
		acc.searchAccount();
		acc.updateAccount();
		acc.deleteAccount();
	}

}
