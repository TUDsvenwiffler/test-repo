package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTestService {

	
	private static TestController controller;
	
	@BeforeEach
	public void setUp() {
		ITestService service = mock(ITestService.class);
		when(service.getModel(1)).thenReturn(new Model("mockModel"));
		controller = new TestController(service);
	}
	
	@Test
	public void testGetModel() {
		Model m = this.controller.getTest(1);
		assertNotNull(m, "Model must not be null");
		assertEquals("mockModel", m.getName(), "Mock Object contains mocked String");
	}
}