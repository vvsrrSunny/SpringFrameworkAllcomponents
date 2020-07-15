package com.cb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MyBeanImpl mb = (MyBeanImpl) ctx.getBean("customFactoryBeanForMyBeanImpl");
		mb.show();
		MyBeanImpl2 mb2 = (MyBeanImpl2) ctx.getBean("myBeanImpl2BeanFactory");
		mb2.show();
	}

}
