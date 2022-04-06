package com.java;

import java.util.Scanner;

public class AddressbookMain {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Workshop ");

		/**
		 * create object for ContactService class,object name as contactService
		 */
		ContactService contactService = new ContactService(sc);
		/**
		 * create object for Contact class,object name as contact
		 */
		ContactPerson contact = new ContactPerson();

		contactService.createPerson(contact, sc);

		System.out.println(contact);
	}
}
