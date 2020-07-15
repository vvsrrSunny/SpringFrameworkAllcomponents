package com.si.beans;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import com.si.biz.Test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

@Component("mybeanhere")
public class MyBeanHere {
	@Value("Bharadwaj VVSRR") // bean reference
	String name;
	// @Value("67")
	int id;

	@Value("#{adress}")
	Adress adress;

	@Autowired
	List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Autowired
	@Qualifier("adress1")
	Adress adress1;

	@Autowired
	@Qualifier("adress2")
	Adress adress2;

	public Adress getAdress2() {
		return adress2;
	}

	public void setAdress2(Adress adress2) {
		this.adress2 = adress2;
	}

	@Override
	public String toString() {
		

		
		return "MyBeanHere [name=" + name + ", id=" + id + ", adress=" + adress.getCity() + ", adress="
				+ adress.getState() + ", adress=" + adress.getCountry() + ", adress1=" + adress1.getCity()
				+ ", adress1=" + adress1.getState() + ", adress1=" + adress1.getCountry() + ", adress2="
				+ adress2.getCity() + ", adress2=" + adress2.getState() + ", adress2=" + adress2.getCountry() + "]";
	}

	public Adress getAdress1() {
		return adress1;
	}

	public void setAdress1(Adress adress1) {
		this.adress1 = adress1;
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
