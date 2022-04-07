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
}
