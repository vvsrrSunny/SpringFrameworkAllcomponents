package com.iocpackage;

import com.iocpackage.Address;

public class Employee {

	Address address;
	Integer id;
	String name;
	public Employee(Address address, Integer id, String name) {
		super();
		this.address = address;
		this.id = id;
		this.name = name;
	}
	void show(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(address.toString());
	}
}
