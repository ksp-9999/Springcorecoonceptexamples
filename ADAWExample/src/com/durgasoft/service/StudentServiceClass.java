package com.durgasoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durgasoft.dao.StudentDaoClass;
import com.durgasoft.dto.Student;

@Service("studentService")
public class StudentServiceClass implements StudentService {

	@Autowired
	private StudentDaoClass Sdaoclass;
	@Override
	public String addStudent(Student stu) {
		String status= 	Sdaoclass.add(stu);
		return null;
	}

	@Override
	public Student searchStudent(String sid) {
		Student stu= Sdaoclass.search(sid);
		return stu;
	}

	@Override
	public Student getStudent(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student stu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
