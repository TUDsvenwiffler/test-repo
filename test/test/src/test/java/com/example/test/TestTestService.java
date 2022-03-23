package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Objects;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTestService {

	
	private TestController controller;
	
	@BeforeEach
	public void setUp() {
		ITestService service = mock(ITestService.class);
		Address addr = new Address("mockStreet", "mockHouse", "mockCity", "mockCountry");
		ContactInfo contact = new ContactInfo("mockPhoneNumber", "mockEmailAddress");
		when(service.getModel(1)).thenReturn(new Model(contact, addr, "mockModel"));
		controller = new TestController(service);
	}
	
	@Test
	public void testGetModel() {
		Model m = this.controller.getTest(1);
		assertNotNull(m, () -> "Model must not be null");
		assertEquals("mockModel", m.name(), "Mock Object contains mocked String");
		
	}
}
