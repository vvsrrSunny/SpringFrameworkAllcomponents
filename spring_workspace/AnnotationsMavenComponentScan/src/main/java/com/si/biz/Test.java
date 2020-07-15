package com.si.biz;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.si.beans.Adress;
import com.si.beans.MyBeanHere;
import com.si.config.AppConfig;

public class Test {

	
	public static void main(String args[]) {
		
		List<String> l;
		Logger logger = Logger.getLogger(Test.class);
		BasicConfigurator.configure();
		logger.info("This method started with log4j's statement");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MyBeanHere myb = (MyBeanHere) ctx.getBean("mybeanhere1", MyBeanHere.class);
		System.out.println(myb.getName() + " and id is " + myb.getId());
		System.out.println(myb.toString());
		l= myb.getList();
		for(String s: l)
		{
			System.out.println("Here the names in mybeanhere1 are  "+s);
		}
		 myb = (MyBeanHere) ctx.getBean("mybeanhere2", MyBeanHere.class);
		System.out.println(myb.getName() + " and id is " + myb.getId());
		System.out.println(myb.toString());
		myb = (MyBeanHere) ctx.getBean("mybeanhere", MyBeanHere.class);
		System.out.println(myb.getName() + " and id is " + myb.getId());
		System.out.println(myb.toString());
		l= myb.getList();
		for(String s: l)
		{
			System.out.println("Here the names are  "+s);
		}
		myb = (MyBeanHere) ctx.getBean("mybeanhere3", MyBeanHere.class);
		System.out.println(myb.getName() + " and id is " + myb.getId());
		System.out.println(myb.toString());
		
		logger.info("This method ended with log4j's statement");
	}
}
