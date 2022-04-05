package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPriorityQueue {

	PriorityQueue<Integer> queue;
	PriorityQueue<Integer> inverseQueue;
	
	@BeforeEach
	public void init() {
		this.queue = new PriorityQueue<Integer>(10);
		queue.addAll(List.of(1, 2, 3, 4, 5, 6, 7));
		
		
		this.inverseQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
		inverseQueue.addAll(List.of(1, 2, 3, 4, 5, 6, 7));
	}
	
	@Test
	public void testQueue() {
		assertEquals(1, this.queue.poll(), "Return the least element");
		assertEquals(7, this.inverseQueue.poll(), "Return the highest element");
	}
}
