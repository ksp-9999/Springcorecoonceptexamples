package com.durgasoft.dao;
import org.springframework.stereotype.Repository;

import com.durgasoft.dto.Student;

@Repository("studentDao")
public class StudentDaoClass implements StudentDao {

	@Override
	public String add(Student std) {
		
		return "";
	}

	@Override
	public Student search(String sid) {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
