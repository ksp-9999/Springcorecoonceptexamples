package com.durgasoft.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Course;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgasoft/resources/applicationContext.xml");
		Course cb1=(Course) context.getBean("courseBean1");
		Course cb2=(Course) context.getBean("courseBean2");
		Course cb3=(Course) context.getBean("courseBean3");
		Course cb=(Course) context.getBean("courseBean");
		cb1.getCourseDetails();
		cb2.getCourseDetails();
		cb3.getCourseDetails();
		cb.getCourseDetails();
	}

}
