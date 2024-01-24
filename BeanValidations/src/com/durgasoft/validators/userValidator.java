package com.durgasoft.validators;



import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.durgasoft.beans.User;

public class userValidator implements Validator {
	
	private Resource resource;
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	
	@Override
	public boolean supports(Class<?> cls) {
		
		return User.class.equals(cls);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		try {
		User user= (User) obj;
		Properties prop = PropertiesLoaderUtils.loadProperties(resource);
		if(user.getUname()==null || user.getUname().equals("")) {
			errors.rejectValue("uname", "error.uname.required",prop.getProperty("error.uname.required"));
		}
		
		
		if(user.getUpswd()==null || user.getUpswd().equals("")) {
			errors.rejectValue("upswd", "error.upswd.required",prop.getProperty("error.upswd.required"));
		}else {
			if(user.getUpswd().length()<7) {
				errors.rejectValue("upswd","error.upswd.minlength" ,prop.getProperty("error.upswd.minlength"));
			}else if(user.getUpswd().length()>12) {
				errors.rejectValue("upswd","error.upswd.maxlength",prop.getProperty("error.upswd.maxlength"));
			}
		}
		
		
		if(user.getUage()==0) {
			errors.rejectValue("uage", "error.uage.required", prop.getProperty("error.uage.required"));
		}else {
			if(user.getUage()<18 || user.getUage()>25) {
				errors.rejectValue("uage", "error.uage.range", prop.getProperty("error.uage.range"));
			}
		}
		
		if(user.getUeamil()==null || user.getUeamil()=="") {
			errors.rejectValue("uemail", "error.uemail.required", prop.getProperty("error.uemail.required"));
		}else {
			if(!user.getUeamil().contains("@")) {
				errors.rejectValue("uemail", "error.uemail.invalid", prop.getProperty("error.uemail.invalid"));
			}
		}
		
		
		if(user.getUmobile()==null || user.getUmobile()=="") {
			errors.rejectValue("umobile", "error.umobile.required", prop.getProperty("error.umobile.required"));
		}else {
			if(!(user.getUmobile().length()!=10) && !user.getUmobile().startsWith("91-")) {
				errors.rejectValue("umobile", "error.umobile.invalid", prop.getProperty("error.umobile.invalid"));
			}
		}
		}
		catch(Exception e){ e.printStackTrace(); }
	}
}
