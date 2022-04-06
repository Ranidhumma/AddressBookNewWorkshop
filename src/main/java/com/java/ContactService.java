package com.java;

import java.util.Scanner;

public class ContactService {

	private Scanner sc;
	private Validator validator;

	/**
	 * create a parameterized constructor name as ContactService
	 * 
	 * @param sc- scanner i/p
	 */
	public ContactService(Scanner sc) {

		this.sc = sc;
		this.validator = new Validator();
	}

	/**
	 * create a method name as createPerson this is parameterized method
	 */
	public void createPerson(ContactPerson contact, Scanner sc) {

		String firstName, lastName, address, city, state, zip, email, phoneNumber;

		System.out.println("first name:");
		while (true) {
			try {
				firstName = sc.nextLine();
				/**
				 * calling validateFirstName method from validator object validateFirstName is a
				 * boolean method,this ans should be true or false
				 */
				validator.validateFirstName(firstName);
				/**
				 * calling setFirstName method from contact object
				 */
				contact.setFirstName(firstName);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("last name:");
		while (true) {
			try {
				lastName = sc.nextLine();
				/**
				 * calling validateLastName method from validator object validateLastName is a
				 * boolean method,this ans should be true or false
				 */
				validator.validateLastName(lastName);
				/**
				 * calling setLastName method from contact object
				 */
				contact.setLastName(lastName);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("address:");
		while (true) {
			try {
				address = sc.nextLine();
				/**
				 * calling validateLastName method from validator object validateLastName is a
				 * boolean method,this ans should be true or false
				 */
				validator.validateAddress(address);
				/**
				 * calling setAddress method from contact object
				 */
				contact.setAddress(address);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("city:");
		while (true) {
			try {
				city = sc.nextLine();
				/**
				 * calling validateCity method from validator object validateCity is a boolean
				 * method,this ans should be true or false
				 */
				validator.validateCity(city);
				/**
				 * calling setCity method from contact object
				 */
				contact.setCity(city);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("state:");
		while (true) {
			try {
				state = sc.nextLine();
				/**
				 * calling validateState method from validator object validateState is a boolean
				 * method,this ans should be true or false
				 */
				validator.validateState(state);
				/**
				 * calling setState method from contact object
				 */
				contact.setState(state);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("zip:");
		while (true) {
			try {
				zip = sc.nextLine();
				/**
				 * calling validateZip method from validator object validateZip is a boolean
				 * method,this ans should be true or false
				 */
				validator.validateZip(zip);
				/**
				 * calling setZip method from contact object
				 */
				contact.setZip(zip);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Phone Number:");
		while (true) {
			try {
				phoneNumber = sc.nextLine();
				/**
				 * calling validatePhoneNumber method from validator object validatePhoneNumber
				 * is a boolean method,this ans should be true or false
				 */
				validator.validatePhoneNumber(phoneNumber);
				/**
				 * calling setPhoneNumber method from contact object
				 */
				contact.setPhoneNumber(phoneNumber);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("email:");
		while (true) {
			try {
				email = sc.nextLine();
				/**
				 * calling validateEmail method from validator object validateEmail is a boolean
				 * method,this ans should be true or false
				 */
				validator.validateEmail(email);
				/**
				 * calling setEmail method from contact object
				 */
				contact.setEmail(email);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("\nContact is added successfully\n");
	}
}
