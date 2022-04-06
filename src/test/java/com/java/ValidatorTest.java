package com.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidatorTest {

	@Test
	public void testValidateFirstName() {
		try {
			Validator obj = new Validator();
			String firstName = "Rani";
			assertEquals(true, obj.validateFirstName(firstName));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateLastName() {
		try {
			Validator obj = new Validator();
			String lastName = "Dhumma";
			assertEquals(true, obj.validateLastName(lastName));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateAddress() {
		try {
			Validator obj = new Validator();
			String address = "Xyz";
			assertEquals(true, obj.validateAddress(address));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateCity() {
		try {
			Validator obj = new Validator();
			String city = "Solapur";
			assertEquals(true, obj.validateCity(city));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateState() {
		try {
			Validator obj = new Validator();
			String state = "Maharashtra";
			assertEquals(true, obj.validateState(state));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateZip() {
		try {
			Validator obj = new Validator();
			String zip = "413002";
			assertEquals(true, obj.validateZip(zip));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateEmail() {
		try {
			Validator obj = new Validator();
			String email = "rd@gmail.com";
			assertEquals(true, obj.validateEmail(email));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidatePhoneNumber() {
		try {
			Validator obj = new Validator();
			String phoneNumber = "91 9999944444";
			assertEquals(true, obj.validatePhoneNumber(phoneNumber));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

}
