/*purpose : implements address book.
 * File :  AdressBook.java
 */
package com.bridgelabz.oops.AdressBook.Controller;

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

import com.bridgelabz.oops.AdressBook.Implementation.Implementation;
@SuppressWarnings("unused")
public class AdressBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Implementation user=new Implementation();
			user.askUser();
		}
}

		