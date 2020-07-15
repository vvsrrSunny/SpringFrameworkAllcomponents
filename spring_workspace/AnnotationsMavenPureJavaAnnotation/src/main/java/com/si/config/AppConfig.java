package com.si.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.si.beans.Adress;
import com.si.beans.MyBeanHere;

@Configuration
@ComponentScan("com.si.beans")
public class AppConfig {

	@Bean(name="mybeanhere")
	public MyBeanHere getMyBeanHereMethod(){
		MyBeanHere my= new MyBeanHere();
		my.setName("Bharadwaj");
		my.setId(1);
		my.setAdress(adress());
		my.list=new ArrayList<String>(Arrays.asList("London", "Tokyo", "New York"));
		my.list.add("John");
		
		
		return(my);
	}
	
	@Bean(name="adress")
	public Adress adress(){
		Adress ad= new Adress();
		ad.setCity("Hyd");
		ad.setState("TS");
		ad.setCountry("India");
		return ad;
	}
	
	@Bean
	public ArrayList<String> springList()
	{
		return new ArrayList<String>(Arrays.asList("sunny", "sai", "raju"));
	}
	
}
