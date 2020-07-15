package com.sh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sh.dao.UserDao;
import com.sh.model.User;

@Component
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);

	}

	@Transactional(readOnly = true)
	@Cacheable("usercache")
	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return userDao.listUsers();
	}

}
