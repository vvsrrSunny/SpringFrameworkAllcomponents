package com.iocpack;

public class Employee {

	Address address;
	int id;
	String name;
	public Employee(Address address, int id, String name) {
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
