package com.javasping;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("appContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		//Student st = (Student) factory.getBean("studentbean1");
		//st.displayInfo();
		//System.out.println(st.toString());
		Department dp = (Department) factory.getBean("department1");
		System.out.println(dp.departmentInfo());
		System.out.println("Students list");
		dp.listStudents();
		System.out.println(dp.toString());
		Department dp2 = (Department) factory.getBean("department2");
		
		System.out.println(dp2.departmentInfo());
		System.out.println("Students list");
		dp2.listStudents();
		System.out.println(dp2.toString());
		Department dp3 = (Department) factory.getBean("department3");
		System.out.println(dp3.departmentInfo());
		System.out.println("Students list");
		dp3.listStudents();
		System.out.println(dp3.toString());
		//System.out.println(dp2.departmentInfo());// dp2 changes dp3 also changes and vicevesa as they use 
		// factory method.
		Department dp4 = (Department) factory.getBean("department1");
		System.out.println(dp4.departmentInfo());
		System.out.println("Students list");
		dp4.listStudents();
		System.out.println(dp4.toString());
		
	}
}