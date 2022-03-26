package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
