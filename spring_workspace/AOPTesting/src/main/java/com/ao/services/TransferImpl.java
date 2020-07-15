package com.ao.services;

import org.springframework.stereotype.Component;

@Component("transferImpl")
public class TransferImpl {


public void setName1()
{
	System.out.println("setting name in transfer class in setname1 logic is executed");
	setName2();
	
	try {
		System.out.println(4/0);
	} catch (Exception e) {
		// TODO: handle exception
	}
}

public void setName2()
{
	System.out.println("setting name in transfer class in setname2 is executed");
}


}
