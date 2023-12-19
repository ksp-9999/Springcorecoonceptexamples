package com.durgasoft.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.durgasoft.beans.Account;
import com.durgasoft.beans.Employee;

@Configuration
public class ConfigClass {
	@Bean
	public Account accbean() {
		Account acc= new Account();
		System.out.println("acc bean created");
		return acc;
	}
	
	@Bean
	public Employee empbean() {
		Employee emp= new Employee();
		emp.setEmpacc(accbean());
		System.out.println("emp bean created");
		return emp;
	}
}
