package com.java;

public class ContactRegistrationException extends Exception {

	/*
	 * custom exception class for invalid contact entry
	 *
	 */
	public ContactRegistrationException(String message) {
		super(message);
	}
}
