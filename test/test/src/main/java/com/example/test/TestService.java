package com.example.test;

import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService{

	public Model getModel(int i) {
		return 	new Model(new ContactInfo(), new Address("street", "house", "city", "country"), String.valueOf(i));	
	}

}
