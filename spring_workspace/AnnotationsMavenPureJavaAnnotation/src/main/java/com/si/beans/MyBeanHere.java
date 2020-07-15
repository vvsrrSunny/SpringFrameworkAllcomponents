package com.si.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyBeanHere {

	@Override
	public String toString() {
		return "MyBeanHere [name=" + name + ", id=" + id + ", adressCity=" + adress.getCity() +", adressState= "+ adress.getState() + ", adress country="+ adress.getCountry() +"]";
	}

	String name;
	int id;
	
	
	//@Autowired
	Adress adress;
	public ArrayList<String> list;// initilized in java way of configuration

	@Autowired
	@Qualifier("springList")
	public ArrayList<String> SpringAnnotationlistInitilizationDemo;
	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
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
