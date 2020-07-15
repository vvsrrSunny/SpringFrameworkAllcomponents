package com.si.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


import com.si.beans.Adress;
import com.si.beans.MyBeanHere;

@Configuration
@ComponentScan("com.si.*")
//@EnableAspectJAutoProxy
public class AppConfig {

	@Bean(name = "mybeanhere1")
	public MyBeanHere getMyBeanHereMethod() {
		MyBeanHere my = new MyBeanHere();
		// my.setName("Bharadwaj");
		ExpressionParser parser = new SpelExpressionParser();

		Expression exp = parser.parseExpression("'Bharadwaj VVR'");
		String name = (String) exp.getValue();
		my.setName(name);
		my.setId(1 * 6);
		List<String> l= new ArrayList<String>(Arrays.asList("sunny1", "sai1", "raju1"));
		my.setList(l);

		return (my);
	}

	@Bean(name = "mybeanhere2")
	public MyBeanHere getMyBeanHereMethod2() {
		MyBeanHere my = new MyBeanHere();
		my.setName("Bharadwaj sunny");
		my.setId(2);

		return (my);
	}

	@Bean(name = "mybeanhere3")
	@Profile("dev")
	public MyBeanHere getMyBeanHereMethod3() {
		MyBeanHere my = new MyBeanHere();
		my.setName("Bharadwaj sunny");
		my.setId(2);

		return (my);
	}

	@Bean(name = "adress1", initMethod = "myinit")
	public Adress getAdress1() {
		Adress ad = new Adress();
		ad.setCity("Mumbay");
		ad.setState("MH");
		ad.setCountry("India");
		return ad;
	}

	@Bean(name = "adress2", initMethod = "myinitForAderss2")
	public Adress getAdress2() {
		Adress ad = new Adress();
		ad.setCity("Delhi");
		ad.setState("Captal");
		ad.setCountry("India");
		return ad;
	}

	@Bean(name = "adress")
	public Adress getAdress() {
		Adress ad = new Adress();
		ad.setCity("HYD");
		ad.setState("TS");
		ad.setCountry("Ind");
		return ad;
	}

	@Bean("list")
	public ArrayList<String> springList() {
		return new ArrayList<String>(Arrays.asList("sunny", "sai", "raju"));
	}
	
	
}
