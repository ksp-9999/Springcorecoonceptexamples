package com.durgasoft.test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.durgasoft.beans.User;
import com.durgasoft.validators.userValidator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml");
		User user= (User) context.getBean("userBean");
		user.getUserDetails();
		System.out.println();
		userValidator uservalidator = (userValidator) context.getBean("userValidator");
		Map<String, String> map= new HashMap<String, String>();
		MapBindingResult result = new MapBindingResult(map, "com.durgasoft.beans.User");
		uservalidator.validate(user, result);
		List<ObjectError> list = result.getAllErrors();
		for(ObjectError error: list) {
			System.out.println(error.getDefaultMessage());
		}

	}

}
