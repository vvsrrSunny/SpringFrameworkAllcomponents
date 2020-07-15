package com.si.biz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.si.beans.MyBeanHere;
import com.si.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class TestAllBeansMethods {
	
	
	@Autowired
	@Qualifier("mybeanhere")
	MyBeanHere my;
	@Before
	public void setUp()
	{
		
	}
	
	@Test
	public void myBeanHereTest()
	{
		assertNotNull(my);
		assertEquals("sunny", my.SpringAnnotationlistInitilizationDemo.get(0));
		assertEquals("London", my.list.get(0));
	}
	

}
