package com.java;

import java.util.Scanner;

public class AddressbookMain {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Workshop");
		ContactService contactService = new ContactService(sc);
		ContactPerson contact = new ContactPerson();
		contactService.createPerson(contact, sc);
		System.out.println(contact + "\n");
		AddressBook addressBook = new AddressBook();
		addressBook.addContact(contact);
		System.out.println("Contact is added into the addressBook");

	}
}
