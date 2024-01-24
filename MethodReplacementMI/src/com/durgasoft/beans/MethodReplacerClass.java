package com.durgasoft.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MethodReplacerClass implements MethodReplacer {

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("----------------------course details--------------------------");
		System.out.println("Course Name:"+"python");
		System.out.println("Course Cost:"+"6849");
		return null;
	}

}
