package com.te;

public class CalculatorImpl implements Calculator {

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub

		return (a + b);
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		double d=new UtilHere().subt(a, b);
		d*=10;
		return d;
	}

	@Override
	public double mul(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double div(double a, double b) {
		// TODO Auto-generated method stub
		UtilHere u= new UtilHere();
		return u.divide(a, b); 
	}

}
