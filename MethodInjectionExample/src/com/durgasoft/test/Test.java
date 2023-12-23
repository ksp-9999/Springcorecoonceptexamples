package com.durgasoft.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Student;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/durgasoft/resources/applicationContext.xml");
		Student stu1=(Student) context.getBean("studentBean");
		Student stu2=(Student) context.getBean("studentBean");
		Student stu3=(Student) context.getBean("studentBean");
		System.out.println();
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println();
		System.out.println(stu1.getScourse());
		System.out.println(stu2.getScourse());
		System.out.println(stu3.getScourse());
		
		

		
		
	}

}
