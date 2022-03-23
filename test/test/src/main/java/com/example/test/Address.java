package com.example.test;

public record Address(String street, String houseNumber, String city, String country)  {

	protected Address() {
		this("", "", "", "");
	}
	

}

	
