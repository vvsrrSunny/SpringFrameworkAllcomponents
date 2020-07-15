package com.si.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("adress")
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
	void myinit()
	{
		System.out.println("myinit");
		this.setCity("Chenni");
	    this.setState("TN");
	    this.setCountry("Bharath");
	}
	
	void myinitForAderss2()
	{
		System.out.println("myinit2");
		this.setCity("Chenni2");
	    this.setState("TN2");
	    this.setCountry("Bharath2");
	}
	
	@PostConstruct
	void postConstructTest()
	{
		System.out.println("postConstructTest");
		this.setCity("Kolkatha");
	}
	
	

}
