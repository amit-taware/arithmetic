package com.Junit.Example.arithmetic;

import static org.junit.Assert.assertEquals;

public class AppTest {

	@org.junit.Test
	public void testMultiply() {

		double a = 5.0;
		double b = -4.0;

		// can change value here
		double expected = -20.0;
		double result = App.multiply(a, b);

		// check if expected is equals to result
		assertEquals(expected, result, 0.00001);
	}

	@org.junit.Test
	public void testAdd() {
		int c = 1;
		int d = 1;

		// test to insert expected to 3 and it shall fail since method should
		// generate 2
		int expected = 2;
		int result = App.add(c, d);

		// Check if expected is equals to result
		assertEquals(expected, result);
	}

	@org.junit.Test
	public void testSub() {
		int a = 10;
		int b = -20;
		int expected = 30;
		int actual = App.subtraction(a, b);
		assertEquals(expected, actual);

	}

}
