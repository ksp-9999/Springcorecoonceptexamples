package com.durgasoft.core;


import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

	public static void main(String[] args) {
		Locale l = new Locale("en","US");
		NumberFormat nf= NumberFormat.getInstance(l);
		System.out.println(nf.format(123456.12345));
		
		Locale l2 = new Locale("it","IT");
		DateFormat df = DateFormat.getDateInstance(2, l);
		System.out.println(df.format(new Date()));
		
		ResourceBundle rb = ResourceBundle.getBundle("com/durgasoft/resources/xyz",l2);
		System.out.println(rb.getString("welcome"));

	}

}
