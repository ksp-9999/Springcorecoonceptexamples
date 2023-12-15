package com.durgasoft.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.durgasoft.beans.HelloBean;
import com.durgasoft.beans.WelcomeBean;

@Configuration
public class AppConfig {
	static {
		System.out.println("Config file loaded");
	}
	
	@Bean
	public WelcomeBean  welcomeBean() {
		return new WelcomeBean();
	}
	
	@Bean
	public HelloBean helloBean() {
		return new HelloBean();
	}
}
