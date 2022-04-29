package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestStringUtils {
		
	@Test
	public void testFirstNonRepeating() {
		String testA = "aasssrrrrrgoo";
		String testB = "aasssrgo";
		String testC = "abc";
		StringUtils util = new StringUtils();
		assertEquals(util.findFirstNonRepeating(testA).get(), 'g', "First non reapeating character is g");
		assertEquals(util.findFirstNonRepeating(testB).get(), 'r', "First non reapeating character is r");
		assertNotEquals(util.findFirstNonRepeating(testC).get(), 'b', "First non repeating character is a not b");
	}
	
	@Test
	public void testStringBlock() {
		String test = """
				Test
				moreTest	
				-> Test""";
		
		String oldTest = "Test\n"+"moreTest\n"+"-> Test";
		
		assertEquals(test, oldTest, "String block should behave like manual concatenation");
	}
	
	@Test
	public void testFormat() {
		String test = "AB, %s";
		String c = String.format(test, "C");
		String two = String.format(test, 2);
		
		assertEquals("AB, C", c);
		assertEquals("AB, 2", two);
	}
}
