package com.ao.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ao.config.AppConfig;
import com.ao.services.TransferImpl;

public class Main {
	
	public static void main(String ags[])
	{
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
		TransferImpl transferImpl= (TransferImpl) applicationContext.getBean("transferImpl");
		transferImpl.setName1();
		System.out.println("\n\n\n");
		
		transferImpl.setName2();
		
	}

}
