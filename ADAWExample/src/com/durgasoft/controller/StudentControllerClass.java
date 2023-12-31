package com.durgasoft.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.durgasoft.dto.Student;
import com.durgasoft.service.StudentServiceClass;

@Controller("studentController")
public class StudentControllerClass implements studentController {

	BufferedReader br = null;
	@Autowired
	private StudentServiceClass ssc;
	public StudentControllerClass() {
		try {
			br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("****Enter Student Details****");
			System.out.print("Enter student Id:");
			String sid=br.readLine();
			System.out.print("Enter student Name:");
			String sname=br.readLine();
			System.out.print("Enter Student Address:");
			String saddr=br.readLine();
			
			Student stu = new Student();
			stu.setSname(sid);
			stu.setSname(sname);
			stu.setSaddr(saddr);
			
			String status =ssc.addStudent(stu);
			
			if(status.equals("existed")) {
System.out.println("Student already exits!");
			}else if (status.equals("success")){
				System.out.println("Student details inserted!!");
			}else {
				System.out.println("Student Insertion failed!");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void addStudent() {
		try {
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	@Override
	public void searchStudent() {
		try {
			System.out.print("Student ID:");
			String sid=br.readLine();
			Student stu=ssc.searchStudent(sid);
			if(stu==null) {
				System.out.println("student not existed");
			}else {
				System.out.println("Student Details");
				System.out.println("----------------------------");
				System.out.println("Student Id: "+stu.getSid());
				System.out.println("Student name: "+stu.getSname());
				System.out.println("Student address: "+stu.getSaddr());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent() {
		try {
			System.out.print("Enter student id: ");
			String sid=br.readLine();
			Student stu= ssc.getStudent(sid);
			if(stu==null) {
				System.out.println("Student does not exist!");
			}else {
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent() {

	}

}
