package com.durgasoft.scopes;

import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope {

	Map<String, Object> scope= null;
	CustomThreadLocal threadlocal= new CustomThreadLocal();
	
	@Override
	public Object get(String name, ObjectFactory<?> ObjectFactory) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerDestructionCallback(String arg0, Runnable arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object resolveContextualObject(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
