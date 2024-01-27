package com.durgasoft.test;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.durgasoft.beans.DataBaseClass;

public class Test {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "production");
		GenericXmlApplicationContext context= new GenericXmlApplicationContext();
		context.load("com/durgasoft/resources/applicationContext-development.xml","com/durgasoft/resources/applicationContext-production.xml");
		context.refresh();
		DataBaseClass dbclass= (DataBaseClass) context.getBean("dbBean");
		dbclass.displayDBDetails();
		
	}

}
