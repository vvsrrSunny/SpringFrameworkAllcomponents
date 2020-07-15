package com.cb;


import org.springframework.beans.factory.config.AbstractFactoryBean;

public class MyBeanImpl2BeanFactory extends AbstractFactoryBean<MyBean>{

	@Override
	protected MyBean createInstance() throws Exception {
		// TODO Auto-generated method stub
		MyBean mb=  (MyBean) new MyBeanImpl2();
		mb.setVar("Bharadwaj");
		return mb;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return MyBean.class;
	}

}
