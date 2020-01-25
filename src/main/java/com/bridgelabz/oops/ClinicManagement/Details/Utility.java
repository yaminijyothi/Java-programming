package com.bridgelabz.oops.ClinicManagement.Details;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utility {
	static Scanner scan = new Scanner(System.in);

	// Taking the String data n returning
	public static                           String getString() {

		return scan.next();

	}

	// Taking the integer data n returning
	public static int getInt() {

		return scan.nextInt();

	}
	// Taking the long data n returning
	public static long getLong() {

		return scan.nextLong();

	}
	// Taking the double data n returning
	public static double getDouble() {

		return scan.nextDouble();

	}

	// Taking the float data
	public static float getFloat() {

		return scan.nextFloat();

	}

	// Taking the boolean data
	public static boolean getBoolean(){

		return scan.hasNext();

	}//Date Formate
public Date printDate(String date) throws java.text.ParseException, ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.parse(date);
	}
}
