package com.jh.dao;

import java.util.List;

import com.jh.model.Person;



public interface PersonDao {
	void add(Person person);
	   List<Person> listPersons();

}
