package com.durgasoft.test;
import org.springframework.core.io.Resource;
import com.durgasoft.beans.Employee;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class Test {

	public static void main(String[] args) {
		Resource resource= new ClassPathResource("/com/durgasoft/resources/applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		Employee emp= (Employee) factory.getBean("Employee");
		emp.getEmpDetails();
	}
}
