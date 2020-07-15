package com.si.beans;



import org.springframework.beans.factory.annotation.Value;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

@Component("mybeanhere")
public class MyBeanHere {
	@Value("Bharadwaj VVSRR")//bean reference
	String name;
	@Value("#{adress.city.length()+200}")// 203
	int id;

	@Value("#{adress}")
	Adress adress;
	
	@Value("#{adress.city.length()==3}")// opeator
	boolean b;
	@Value("#{adress.city.length()<3 and adress.city.length()>1}")// an example of regula expressions
	boolean b2;
	
	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	

	
	@Override
	public String toString() {
		return "MyBeanHere [name=" + name + ", id=" + id + ", adress=" + adress.getCity() + ", adress1="
				+ adress.getState() + " boolean value "+b+" boolean value "+b2+"]";
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
