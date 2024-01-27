package com.durgasoft.test;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
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
			System.out.println(p.getPropertyType());
			System.out.println(p.getReadMethod().getName());
			System.out.println(p.getWriteMethod());
			System.out.println("-------------------------------------------");
		}
		System.out.println();
		MethodDescriptor[] mds= bi.getMethodDescriptors();
		for(MethodDescriptor md: mds) {
			System.out.println(md.getName());
		}
	}

}
