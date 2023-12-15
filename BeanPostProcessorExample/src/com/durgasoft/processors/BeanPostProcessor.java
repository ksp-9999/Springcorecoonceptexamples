package com.durgasoft.processors;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import com.durgasoft.beans.Account;

public class BeanPostProcessor implements BeanPostProcessor {
	@	Override
	public Object postProcessBeforeInitialization(Object bean,String name) throws BeansException{
		Account acc= (Account) bean;
		acc.setAtype("savings");
//		acc details are customized here
		return acc;
		}
	@Override
		public Object postProcessAfterInitialization(Object bean,String name) throws BeansException{
		Account acc= (Account) bean;
		String email=acc.getAemail();
		if(!email.contains("@")) {
			email+="gmail.com";
			acc.setAemail(email);
		}
		String mno=acc.getaHolderMobile();
		if(!mno.startsWith("91-")) {
			mno+="91-";
			acc.setaHolderMobile(mno);
		}
		return acc;
		}
}
