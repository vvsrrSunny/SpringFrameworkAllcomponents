package com.bl.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component("st")
public class Student implements BeanPostProcessor {

	String name;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

    @PostConstruct
	void myinit() {
		System.err.println("we are in student init");
		System.err.println("Check initalization wether done or not " + this.id);
	}
    @PreDestroy
	void destroy() {
		System.out.println("Destroy method is called");

	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.err.println("we are in postProcessAfterInitialization phase and bean mane is "+beanName);
		
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.err.println("we are in postProcessBeforeInitialization phase and bean mane is "+beanName);
		
		return bean;
	}

}
