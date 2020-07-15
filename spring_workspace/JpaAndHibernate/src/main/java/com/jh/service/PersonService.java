package com.jh.service;

import java.util.List;

import com.jh.model.Person;

public interface PersonService {
	void add(Person person);

	List<Person> listPersons();

}
