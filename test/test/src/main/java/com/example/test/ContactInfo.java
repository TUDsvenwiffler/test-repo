package com.example.test;

public record ContactInfo(String phoneNumber, String emailAddress) {

	public ContactInfo() {
		this("", "");
	}
}
