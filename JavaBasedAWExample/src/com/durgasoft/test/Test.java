package com.durgasoft.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.durgasoft.beans.Employee;
import com.durgasoft.resources.ConfigClass;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(ConfigClass.class);
		Employee emp=(Employee) context.getBean("empbean");
		emp.getEmpid();
	}

}
