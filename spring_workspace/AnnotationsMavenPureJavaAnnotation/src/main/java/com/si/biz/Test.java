package com.si.biz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.si.beans.Adress;
import com.si.beans.MyBeanHere;
import com.si.config.AppConfig;

public class Test {

	public static void main(String args[]) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MyBeanHere myb = (MyBeanHere) ctx.getBean("mybeanhere", MyBeanHere.class);
		System.out.println(myb.getName() + " and id is " + myb.getId());
		System.out.println(myb.toString());
		for(String s:myb.list)
		{
			System.out.println(s);
		}
		System.out.println();
		for(String s:myb.SpringAnnotationlistInitilizationDemo)
		{
			System.out.println(s);
		}
	}
}
