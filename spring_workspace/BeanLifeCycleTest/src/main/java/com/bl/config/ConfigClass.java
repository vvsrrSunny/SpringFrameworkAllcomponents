package com.bl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bl.beans.Student;

@Configuration
@ComponentScan("com.bl.beans")
public class ConfigClass {

	// @Bean(initMethod="myinit", name="getStudent", destroyMethod="destroy")
	@Bean(name = "getStudent")
	public Student getStudent() {
		Student st = new Student();
		st.setName("Bharadwaj");
		st.setId(100);
		return st;
	}

}
