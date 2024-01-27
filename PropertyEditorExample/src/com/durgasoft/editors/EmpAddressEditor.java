package com.durgasoft.editors;

import java.beans.PropertyEditorSupport;

import com.durgasoft.beans.EmpAddress;

public class EmpAddressEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[]  s= text.split("-");
		EmpAddress ea= new EmpAddress();
		ea.setHno(s[0]);
		ea.setStreet(s[1]);
		ea.setCity(s[2]);
		ea.setState(s[3]);
		ea.setCountry(s[4]);
		super.setValue(ea);
	}
}
