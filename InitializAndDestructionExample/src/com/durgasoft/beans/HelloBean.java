package com.durgasoft.beans;
import javax.annotation.PostConstruct; 
import javax.annotation.PreDestroy; 
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean,DisposableBean{
	private String name;
	private String msg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Intializing name through setName()");
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		System.out.println("Intializing msg through setMsg()");
		this.msg = msg;
	}
	
	public void init() {
		System.out.println("custominit()-method");
		name="Nag";
		msg="Good afternoon";
	}
	public void customdestroy() {
		System.out.println("customdestroy()-method");
		name=null;
		msg=null;
		sayHello();
	}
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("Initializing through afterPropertiesSet() method");
		name="ram charan";
		msg="congratulations!";
	}
	@Override
	public void destroy() throws Exception{
		System.out.println("interfacedestroy method");
	}
	@PostConstruct
	public void initializeBean() {
		System.out.println("@PostConstruct method");
		name="mounika";
		msg="Happy sunday";
	}
	@PreDestroy
	public void destroyBean() {
		System.out.println("@PreDestroy method");
	}
	public void sayHello() {
		System.out.println("Hello "+this.name+"! "+this.msg);
	}
}
