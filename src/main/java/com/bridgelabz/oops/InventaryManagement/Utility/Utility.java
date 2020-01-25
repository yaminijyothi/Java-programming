package com.bridgelabz.oops.InventaryManagement.Utility;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Utility {

	static Scanner scan = new Scanner(System.in);

	// Taking the String data n returning
	public static String getString() throws Exception {

		return scan.next();

	}

	// Taking the integer data n returning
	public static int getInt() throws Exception {

		return scan.nextInt();

	}

	public static long getLong() throws Exception {

		return scan.nextLong();

	}
	// Taking the double data n returning
	public static double getDouble() throws Exception {

		return scan.nextDouble();

	}

	// Taking the float data
	public static float getFloat() throws Exception {

		return scan.nextFloat();

	}

	// Taking the boolean data
	public static boolean getBoolean() throws Exception {

		return scan.hasNext();

	}
	//declaring a json array to strore all elements in data
	public static JSONArray readFile() throws Exception {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("inventory.json");
		// Read JSON file
		JSONArray obj = (JSONArray) jsonParser.parse(reader);
		return obj;
	}

	public static void writeIntoFile(JSONArray array)  {
		// TODO Auto-generated method stub

		try {
			FileWriter write=new FileWriter("inventory.json");
			write.write(array.toJSONString());
			write.flush();
			write.close();
			System.out.println("file successfully copied...");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	@SuppressWarnings("unchecked")
	public static JSONObject addData(String name,double weight,double price) {
		// TODO Auto-generated method stub
		JSONObject json1= new JSONObject();
		json1.put("Name",name);
		json1.put("weight", weight);
		json1.put("price",price);
		return json1;
	}
}
