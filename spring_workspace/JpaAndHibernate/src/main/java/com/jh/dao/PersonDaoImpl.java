package com.jh.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.jh.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(Person person) {
		// TODO Auto-generated method stub
		em.persist(person);

	}

	@Override
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		CriteriaQuery<Person> criteriaQuery = em.getCriteriaBuilder().createQuery(Person.class);
	      @SuppressWarnings("unused")
	      Root<Person> root = criteriaQuery.from(Person.class);
	      return em.createQuery(criteriaQuery).getResultList();
	}

}
