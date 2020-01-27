package com.bridgelabz.oops.AdressBook.Implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.AdressBook.FileAccess.FileAccess;

public class Implementation {
	Scanner sc=new Scanner(System.in);
	FileAccess fl=new FileAccess();
	//details to add adressbook
	public 	void askUser() {
		System.out.println("Select an option..");
		System.out.println("1. Add a person");
		System.out.println("2. Edit");
		System.out.println("3. Delete a person");
		System.out.println("4. Search a person");
		System.out.println("5. Quit");

		int ch = sc.nextInt();
		switch(ch) {
		case 1://add the details of person
			addAPerson();
			System.out.println("\n");
			askUser();
			break;
		case 2://enter first and last names of user to edit the details
			System.out.print("Enter first and last name of the person to edit the contact: ");
			commonPart(ch);
			System.out.println("\n");
			askUser();
			break;
		case 3://delete the details of the person
			System.out.print("Enter first and last name of the person to delete the contact: ");
			commonPart(ch);
			System.out.println("\n");
			askUser();
			break;
		case 4://searching of person
			System.out.print("Enter first and last name of the person to search: ");
			commonPart(ch);
			System.out.println("\n");
			askUser();
			break;
		default:
			break;
		}
	}

	//gets user's information
	public void addAPerson() {
		System.out.print("Enter first name:");
		String firstName = sc.next();
		System.out.print("enter last name: ");
		String lastName = sc.next();

		System.out.print("Enter complete address: ");
		String address = sc.nextLine();

		System.out.print("Enter city, state and zip: ");
		String city = sc.next();
		String state = sc.next();
		String zip = sc.next();

		System.out.println("Enter phone number: ");
		String phoneNumber = sc.next();

		Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
		JSONObject jsonObject = person.toJsonObject();

		fl.writeBook(jsonObject);
	}


	// Edits a person;s information 
	@SuppressWarnings("unchecked")
	public void edit(JSONObject jsonObject, JSONArray bookArray, int i) {
		System.out.println("What do you want to edit?");
		System.out.println("1. Address");
		System.out.println("2. Phone Number");

		int choice = sc.nextInt();
		switch (choice) {
		case 1://edit address
			System.out.print("Enter address: ");
			sc.nextLine();

			String address = sc.nextLine();
			System.out.print("Enter city, state and zip: ");
			String city = sc.next();
			String state = sc.next();
			String zip = sc.next();

			jsonObject.put("Address", address);
			jsonObject.put("City", city);
			jsonObject.put("State", state);
			jsonObject.put("Zip", zip);
			break;

		case 2://edit mobile number
			System.out.println("Enter phone number: ");
			String phoneNumber = sc.next();
			jsonObject.put("Phone Number", phoneNumber);
			break;
		}

		bookArray.remove(i);
		bookArray.add(i, jsonObject);

		fl.printWriter(bookArray);
		System.out.println("Contact updated successfully");
	}

	// Deletes a person's information 
	public void delete(JSONArray bookArray, int i) {
		bookArray.remove(i);

		fl.printWriter(bookArray);
		System.out.println("Contact deleted successfully");
	}

	// Displays person's record 
	public void search(JSONObject jsonObject) {
		System.out.println("Name:\n" + jsonObject.get("First Name") + " " + jsonObject.get("Last Name"));
		System.out.println("Address:\n" + jsonObject.get("Address"));
		System.out.print(jsonObject.get("City") + ", ");
		System.out.print(jsonObject.get("State") + " - ");
		System.out.println(jsonObject.get("Zip"));
		System.out.println("Phone Number:\n" + jsonObject.get("Phone Number"));
	}

	
	@SuppressWarnings("unchecked")
	// Reads json file and adds information to json array
	public void commonPart(int choice) {
		JSONParser parser = new JSONParser();
		String firstName = sc.next();
		String lastName = sc.next();
		JSONArray bookArray = null;

		try {
			bookArray = (JSONArray) parser.parse(new FileReader("addressbook.json"));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		@SuppressWarnings("rawtypes")
		Iterator iterator = bookArray.iterator();
		int i = 0;
		boolean b = false;
		outer:
			while (iterator.hasNext()) {
				JSONObject jsonObject = (JSONObject) iterator.next();
				if (jsonObject.get("First Name").equals(firstName) && jsonObject.get("Last Name").equals(lastName)) {
					b = true;
					switch (choice) {
					case 2:
						edit(jsonObject, bookArray, i);
						break outer;
					case 3:
						delete(bookArray, i);
						break outer;
					case 4:
						search(jsonObject);
						break outer;
					}
				}
				i++;
			}
		if(!b) {
			System.out.println("\nSorry!!! Person not found...");
		}
	}
}

