package com.jh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jh.dao.PersonDao;
import com.jh.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao userDao;

	@Transactional
	@Override
	public void add(Person person) {
		// TODO Auto-generated method stub
		userDao.add(person);

	}
	
	@Transactional
	@Override
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		return userDao.listPersons();
	}

}
