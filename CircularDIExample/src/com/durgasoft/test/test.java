package com.durgasoft.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Branch;
import com.durgasoft.beans.Student;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgasoft/resources/config.xml");
		Student stu=(Student) context.getBean("stuBean");
		System.out.println(stu.getBranchName());
		Branch branch= (Branch) context.getBean("branchBean");
		System.out.println(branch.getStu());
	}

}
