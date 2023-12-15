package com.durgasoft.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.HelloBean;
import com.durgasoft.beans.WelcomeBean;
import com.durgasoft.beans.WishBean;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgasoft/resources/applicationContext.xml");
//		HelloBean hb= (HelloBean) context.getBean("HelloBean");
//		hb.sayHello();
		
		WishBean wb= (WishBean) context.getBean("WishBean");
		wb.sayWish();
		
		WelcomeBean wlb = (WelcomeBean) context.getBean("WelcomeBean");
		wlb.sayWelcome();

	}

}
