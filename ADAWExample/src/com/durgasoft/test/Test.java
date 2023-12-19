package com.durgasoft.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.controller.StudentControllerClass;
public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/durgasoft/resources/applicationContext.xml");
		StudentControllerClass studentcontroller=(StudentControllerClass) context.getBean("studentController");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Select the Action");
			System.out.println("1. Add");
			System.out.println("2. Search");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.print("****Enter Your Option[1,2,3,4,5]****");
			int option= Integer.parseInt(br.readLine());
			switch(option) {
			case 1: 
				studentcontroller.addStudent();
				break;
			case 2:
				studentcontroller.searchStudent();
				break;
			case 3:
				studentcontroller.updateStudent();
				break;
			case 4:
				studentcontroller.deleteStudent();
				break;
			case 5:
				System.out.println("Thank you!. Visit again..");
				System.exit(0);
				break;
			default:
				System.out.println("Enter a valid option!");
				break;
			}
			
		}
		
		
		
	}

}
