package com.bridgelabz.oops.InventaryManagement.Utility;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
	static JSONArray  arr=new JSONArray();
	//rice object
	@SuppressWarnings("unchecked")
	public static JSONObject rice(String name,long weight,long price) {
		// TODO Auto-generated method stub

		JSONObject obj= new JSONObject();
		obj.put("Name",name);
		obj.put("weight", weight);
		obj.put("price",price);


		JSONObject json= new JSONObject();
		json.put("Rice", obj);
		arr.add(json);
		writeIntoFile(arr);
		return json;
	}
//wheat object
	@SuppressWarnings("unchecked")
	public static JSONObject wheat(String wname, long wweight, long wprice) {
		// TODO Auto-generated method stub
		JSONObject obj= new JSONObject();
		obj.put("Name",wname);
		obj.put("weight",wweight);
		obj.put("price",wprice);


		JSONObject json= new JSONObject();
		json.put("Wheat", obj);

		arr.add(json);
		writeIntoFile(arr);
		return json;
	}
//to read the data
	public static void read(JSONObject data) {
		// TODO Auto-generated method stub

		JSONObject Data = (JSONObject)data.get("Rice");

		String riceName = (String)Data.get("Name");
		long riceWeight = (long)Data.get("weight");
		long ricePrice = (long)Data.get("price");

		System.out.println("Name:"+riceName);
		System.out.println("Weight:"+riceWeight);
		System.out.println("price:"+ricePrice);

	}	
//data write into file using filewriter
	public static void writeIntoFile(JSONArray arr)  {
		// TODO Auto-generated method stub

		try {
			FileWriter write=new FileWriter("/home/user/Desktop/inventory.json");
			write.write(arr.toJSONString());
			write.flush();
			write.close();
			System.out.println("file successfully copied...");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

