package com.cb;

public class MyBeanImpl implements MyBean {

	String st;
	
	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.st); 
		
	}



	@Override
	public String getVar() {
		// TODO Auto-generated method stub
		
		return st;
	}



	@Override
	public void setVar(String st) {
		// TODO Auto-generated method stub
		this.st=st;
		
	}
	

}
