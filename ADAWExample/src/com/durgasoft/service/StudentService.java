package com.durgasoft.service;

import com.durgasoft.dto.Student;

public interface StudentService {
	public String addStudent(Student stu);
	public Student searchStudent(String sid);
	public Student getStudent(String sid);
	public String updateStudent(Student stu);
	public String deleteStudent(String sid);
	
	
}
