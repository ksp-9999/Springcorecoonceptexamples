package com.durgasoft.event;

import org.springframework.context.ApplicationEvent;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class AccountEvent extends ApplicationEvent {
    private String msg;
    private static FileOutputStream fos;
    static {
    	try {
			fos= new FileOutputStream("E:/logs/log.txt",true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
	public AccountEvent(Object obj,String msg) {
		super(obj);
		this.msg=msg;
	}
	
	public void generateLog() {
		try {
			msg = new Date().toString()+" : "+msg+"\n";
			byte[] b= msg.getBytes();
			fos.write(b);
		}catch(Exception e) {
			
		}
	}

}
