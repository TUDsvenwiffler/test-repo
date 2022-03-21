package com.example.test;

public class TestService implements ITestService{

	public Model getModel(int i) {
		return 	new Model("from Service");	
	}

}
