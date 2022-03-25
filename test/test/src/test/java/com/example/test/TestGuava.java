package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class TestGuava {
	
	LoadingCache<String, Integer> cache;
	
	@BeforeEach
	public void setup() {
		this.cache = CacheBuilder.newBuilder().maximumSize(1000)
				.expireAfterWrite(10, TimeUnit.MINUTES).build(new CacheLoader<String, Integer>() {

					@Override
					public Integer load(String aString) {
						return aString.length();

					}

				});
	}
	
	@Test
	public void testCache() {
		try {
			assertEquals(4, cache.get("abcd"), "Incorrect string length");
			assertEquals(11, cache.get("rdfefasdasd"), "Incorrect string length");
			assertEquals(4, cache.get("abcd"), "Incorrect string length");
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
