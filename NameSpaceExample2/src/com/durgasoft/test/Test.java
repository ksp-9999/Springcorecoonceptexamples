package com.durgasoft.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Student;

import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgasoft/resources/config.xml");
		Student stu=(Student) context.getBean("studentBean");
		stu.getStudentDetails();
	}

}
