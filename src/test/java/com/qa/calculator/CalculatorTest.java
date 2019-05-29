package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void divide()
	{
		Calculator calc = new Calculator();
		int actualValue = calc.divide(2, 2);
		Assert.assertEquals(1, actualValue);
	}

}
