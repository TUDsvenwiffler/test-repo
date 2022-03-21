package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("test")
public class TestController {

	
	@GetMapping(value ="/{id}", produces = "application/json")
	public Model getTest(@PathVariable int id) {
		return TestService.getModel(id);
	}
}
