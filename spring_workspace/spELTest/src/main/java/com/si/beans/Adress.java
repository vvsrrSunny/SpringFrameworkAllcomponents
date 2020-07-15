package com.si.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="adress")
public class Adress {

	@Value("Hyd")
	String city;

	@Value("TS")
	String state;

	@Value("IND")
	String country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public void myinit()
	{
		this.setCity("chenni");
		System.out.println("in init");
	}

}
