package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;

import com.google.common.math.BigDecimalMath;

public class TestMathUtils {
	
	
	@Test
	public void testMath() {
		List<BigDecimal> numbers = Arrays.asList(new BigDecimal("2.55"), new BigDecimal("3.55"));
		
		BigDecimal result = numbers.stream().reduce(BigDecimal.valueOf(0), (a, b) -> a.add(b));
		
		assertEquals(new BigDecimal("6.1").compareTo(result), 0, "Result of addition must be mathematically equal to 6.1");
		
		double resultDouble = BigDecimalMath.roundToDouble(result, RoundingMode.HALF_UP);
		assertEquals(6.1, resultDouble);
	}
	
	@Test
	public void testMath2() {
		BigDecimal a = BigDecimal.valueOf(2.55);
		BigDecimal b = BigDecimal.valueOf(3.55);
		
		BigDecimal c = BigDecimal.valueOf(6.1);
		
		assertEquals(c.compareTo(a.add(b)), 0);
	}
 
	@Test
	public void testOr() {
		int a = 0;
		a |= 1;
		assertEquals(1, a, "Or should result in 1");
		a &= 0;
		assertEquals(0, a, "And should result in 0");
		
		int x = 4;
		int y = 10;
		x^=y;
		y^=x;
		x^=y;
		assertEquals(x, 10, "Should be swaped to 10");
		assertEquals(y, 4, "Should be swaped to 4");
	}
	
	@Test
	public void testNull() {
		int a = 5;
		int b = 0;
		
		
		assertThrows(ArithmeticException.class, ()->{
			int c = a/b;
		});
		
		assertThrows(Throwable.class, ()->{
			Integer.parseInt("Two");
		});
		
	}


}
