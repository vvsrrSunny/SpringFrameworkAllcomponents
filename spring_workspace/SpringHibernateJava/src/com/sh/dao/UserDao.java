package com.sh.dao;

import java.util.List;

import com.sh.model.User;

public interface UserDao {
	void add(User user);

	List<User> listUsers();
}
