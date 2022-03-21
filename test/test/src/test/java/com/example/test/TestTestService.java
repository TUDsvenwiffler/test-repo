package com.example.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TestTestService {

	@Test
	public void testGetModel() {
		Model m = TestService.getModel(1);
		assertNotNull(m, "Model must not be null");
	}
}
