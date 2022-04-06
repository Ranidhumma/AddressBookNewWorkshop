package com.java;

import java.util.Objects;
import java.util.Scanner;

public class AddressbookMain {

	private static Scanner scanner = new Scanner(System.in);
	/**
	 * create object for ContactService class object name as contactService
	 */
	static ContactService contactService;
	/**
	 * create object for AddressBook class object name as addressBook
	 */
	static AddressBook addressBook;

	/**
	 * create a method name as findContact
	 */
	public static void findContact() {
		System.out.println("Enter Person Name");
		String name = scanner.nextLine();
		/**
		 * search this person by name in address book and display contact
		 */
		contactService.displayContact(addressBook.searchByName(name));
	}

	public static void editContact() {

		System.out.println("Enter Person Name");
		String name = scanner.nextLine();
		ContactPerson contact = addressBook.searchByName(name);

		if (Objects.nonNull(contact)) {
			/**
			 * calling editExistingContact method from contactService object
			 */
			contactService.editExistingContact(contact);
			return;
		}
		System.out.println("Person Not Found");
	}

	public static void createContact() {

		addressBook.addContact(contactService.createContact());
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Workshop");
		addressBook = new AddressBook();
		contactService = new ContactService(scanner);
		while (true) {
			System.out.println(
					"\nAddress Book Options:\n1 (Add new contact)\n2 (Edit existing contact)\n3 (View all contact)\n4 (Find contact)\n5 Exit");
			int option = Integer.parseInt(scanner.nextLine());

			switch (option) {

			case 1:
				createContact();
				break;

			case 2:
				editContact();
				break;

			case 3:

				System.out.println(addressBook);
				break;

			case 4:

				findContact();
				break;

			case 5:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Invalid");
			}
		}
	}
}
