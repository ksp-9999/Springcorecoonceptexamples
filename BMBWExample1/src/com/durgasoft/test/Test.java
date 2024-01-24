package com.durgasoft.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.durgasoft.entity.Employee;

public class Test {

	public static void main(String[] args) throws Exception {
//		Class c = Class.forName("com.durgasoft.entity.Employee");
//		System.out.println(c.getName());
//		
//		Employee e = new Employee();
//		Class c2 = e.getClass();
//		System.out.println(c2.getName());
//		
//		Class<Employee> c3= Employee.class;
//		System.out.println(c3.getName());
		
		Class c= Class.forName("com.durgasoft.entity.Employee");
		System.out.println(c.getName());
		System.out.println(c.getSuperclass().getName());
		Class[] ca= c.getInterfaces();
		for(Class cl : ca) {
			System.out.println(cl);
		}
		Field[] f= c.getDeclaredFields();
		for(Field fl: f) {
			System.out.println(fl.getName());
		}
		System.out.println();
		System.out.println("----Constructors----------");
		Constructor[] cons =c.getDeclaredConstructors();
		for(Constructor con: cons) {
			System.out.print(con.getName()+"          ");
		}
		System.out.println();
		System.out.println("--------------methods----------");
		Method[] mds= c.getDeclaredMethods();
		for(Method md: mds) {
			System.out.println(md.getName());
		}
	}

}
