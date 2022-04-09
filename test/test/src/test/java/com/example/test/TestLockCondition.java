package com.example.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.jupiter.api.Test;

public class TestLockCondition {
	
	@Test
	public void testLock() {
		Lock lock = new ReentrantLock();
		lock.tryLock();
		lock.unlock();
		assertNotNull(lock);
	}

}
