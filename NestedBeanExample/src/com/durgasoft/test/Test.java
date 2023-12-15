package com.durgasoft.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Employee;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgasoft/resources/applicationContext.xml");
		Employee emp= (Employee) context.getBean("empBean");
		emp.getEmpDetails();
	}

}
