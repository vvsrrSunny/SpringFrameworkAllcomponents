package com.sh.service;

import java.util.List;

import com.sh.model.User;

public interface UserService {
	void add(User user);

	List<User> listUsers();
}