package com.durgasoft.factory;

import com.durgasoft.beans.HelloBean;

public class HelloBeanFactory {
	public HelloBean getHelloBeanInstance() {
		System.out.println("getHelloBeanInstance() HelloBean factory");
		return new HelloBean();
	}
}
