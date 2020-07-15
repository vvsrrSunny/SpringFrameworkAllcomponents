package com.te;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



public class TestCalculator {

	Calculator c;
	UtilHere u = mock(UtilHere.class);

	@Before
	public void setUp() {
		c = new CalculatorImpl();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
		assertEquals(3.0, c.add(1, 2),0.00001);
	}

	@Test
	public void testSub() {
     when(u.subt(5, 1)).thenReturn((double) 4);
     
     assertEquals(40,c.sub(5.0, 1.0),0.00001 );
	}

}
