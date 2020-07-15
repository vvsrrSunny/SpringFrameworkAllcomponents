package com.cb;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class CustomFactoryBeanForMyBeanImpl extends AbstractFactoryBean<MyBean> {

	@Override
	protected MyBean createInstance() throws Exception {
		// TODO Auto-generated method stub
		MyBean mb= new MyBeanImpl();
		mb.setVar("John");
		return mb;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return MyBean.class;
	}

}
