package com.durgasoft.beans;

import java.util.ArrayList;

public class City_State_Colection {
	private ArrayList<City_State> al= new ArrayList<City_State>();
	public ArrayList<City_State> getCityStateObjs(){
		City_State c1= new City_State();
		c1.setCity("Hyd");
		c1.setState("TG");
		City_State c2= new City_State();
		c2.setCity("Ban");
		c2.setState("KA");
		City_State c3= new City_State();
		c3.setCity("Chn");
		c3.setState("TN");
		al.add(c1);
		al.add(c2);
		al.add(c3);
		return al;
	}
}
