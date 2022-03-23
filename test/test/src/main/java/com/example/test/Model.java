package com.example.test;

public record Model(ContactInfo contact, Address address, String name) {
	

	public Model() {
		this(new ContactInfo(), new Address(), "");
	}
	
	

}
