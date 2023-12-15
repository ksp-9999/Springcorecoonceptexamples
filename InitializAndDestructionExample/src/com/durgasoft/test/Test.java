package com.durgasoft.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.durgasoft.beans.HelloBean;
import com.durgasoft.beans.WishBean;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/durgasoft/resources/applicationContext.xml");
		HelloBean hb= (HelloBean) context.getBean("HelloBean");
		hb.sayHello();
		System.out.println("---------------------------");
		WishBean wb=(WishBean) context.getBean("WishBean");
		wb.sayWish();		
		context.registerShutdownHook();
	}

}
