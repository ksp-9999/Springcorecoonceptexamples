package com.durgasoft.test;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Employee;
public class Test {

	public static void main(String[] args) throws Exception{
		ApplicationContext context= new ClassPathXmlApplicationContext();
		
		BeanInfo bi= Introspector.getBeanInfo(Employee.class);
		System.out.println();
		PropertyDescriptor[] pd= bi.getPropertyDescriptors();
		for(PropertyDescriptor p: pd) {
			System.out.println(p.getName());
		}

	}

}
