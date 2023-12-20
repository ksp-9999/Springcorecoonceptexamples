package com.durgasoft.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Student;

import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgasoft/resources/applicationContext.xml");
		Student std= (Student) context.getBean("studentBean");
		std.getStudentDetails();

	}

}
