package com.disi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String args[])
	{
//		ApplicationContext ac = new ClassPathXmlApplicationContext("appContext.xml");
//		Question question= (Question) ac.getBean("q1");
//		question.displayInfo();
		Resource r=new ClassPathResource("ApplicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Question q=(Question)factory.getBean("q1");
	    q.displayInfo();  
	    Question q2=(Question)factory.getBean("q1");
	    System.err.println("Diplaying an other bean");
	    q2.displayInfo();
	    System.err.println("Test begins");
	    q.id=0;
	    q2.displayInfo();
	
	}

}
