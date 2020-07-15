package com.sh.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

import com.sh.model.User;

@Repository
public class UserDaoImp implements UserDao
{
	
	@Autowired
	   private SessionFactory sessionFactory;
	


	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
		
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
	      TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
		System.out.println("listUsersMethod in DAP is Called fo result so now cache is not used");
	      return query.getResultList();
	}

}
