package com.durgasoft.test;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import com.durgasoft.beans.Employee;

public class Test {

	public static void main(String[] args) {
		BeanWrapper bw= new BeanWrapperImpl(Employee.class);
		bw.setPropertyValue("eno", 111);
		bw.setPropertyValue("ename","sai prasad");
		bw.setPropertyValue("esal",79878.98);
		bw.setPropertyValue("eaddr", "Guntur");
		System.out.println();
		System.out.println("-----Employee details-------");
		System.out.println("Emp No: "+bw.getPropertyValue("eno"));
		System.out.println("Emp Name: "+bw.getPropertyValue("ename"));
		System.out.println("Emp salary: "+bw.getPropertyValue("esal"));
		System.out.println("Emp addr: "+bw.getPropertyValue("eaddr"));
		
		Map<String, Object> map= new HashMap();
		map.put("eno", 222);
		map.put("ename","sudheer");
		map.put("esal",12222.98);
		map.put("eaddr","Hyderabad");
		bw.setPropertyValues(map);
		
		Employee emp=(Employee) bw.getWrappedInstance();
		emp.getEmpDetails();
		System.out.println();
		System.out.println(bw.isReadableProperty("eno"));
		System.out.println(bw.isWritableProperty("eno"));
		
		
	}

}
