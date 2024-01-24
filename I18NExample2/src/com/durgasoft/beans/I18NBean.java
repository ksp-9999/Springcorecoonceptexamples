package com.durgasoft.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;


public class I18NBean {
	private MessageSource ms;
	public void setMs(MessageSource ms) {
		this.ms = ms;
	}
	Locale l1 = new Locale("en","US");
	Locale l2 = new Locale("it","IT");
	public void displayMsg() {
		System.out.println("Message: "+ms.getMessage("welcome", new Object[]{"en","US"}, l1));
		System.out.println("Message: "+ms.getMessage("welcome", new Object[]{"it","IT"}, l2));
	}
}
