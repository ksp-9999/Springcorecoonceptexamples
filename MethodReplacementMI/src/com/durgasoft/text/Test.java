package com.durgasoft.text;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Course;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/durgasoft/resources/applicationContext.xml");
		Course course= (Course) context.getBean("courseBean");
		course.getCourseDetails();

	}

}
