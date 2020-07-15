package com.bl.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.bl.beans.Student;
import com.bl.config.ConfigClass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("app started");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
		Student st = (Student) ctx.getBean("getStudent", Student.class);
		System.out.println(st.toString());

	}

}
