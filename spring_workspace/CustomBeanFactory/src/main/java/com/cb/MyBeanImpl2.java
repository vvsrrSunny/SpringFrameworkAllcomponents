package com.cb;

public class MyBeanImpl2 implements MyBean {
	
	String st2;
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(st2);
	}

	@Override
	public String getVar() {
		// TODO Auto-generated method stub
		return st2;
	}

	@Override
	public void setVar(String st) {
		// TODO Auto-generated method stub
		this.st2=st;
	}

}
