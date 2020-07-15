package com.cb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cb.*")
public class AppConfig {

	@Bean("customFactoryBeanForMyBeanImpl")
	CustomFactoryBeanForMyBeanImpl getBean() {
		CustomFactoryBeanForMyBeanImpl cf = new CustomFactoryBeanForMyBeanImpl();
		return cf;
	}
	@Bean("myBeanImpl2BeanFactory")
	MyBeanImpl2BeanFactory getMyBeanImpl2BeanFactory()
	{
		MyBeanImpl2BeanFactory mb = new MyBeanImpl2BeanFactory();
		return mb;
		
		
	}

}
