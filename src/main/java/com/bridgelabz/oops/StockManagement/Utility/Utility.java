package com.bridgelabz.oops.StockManagement.Utility;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Utility {

		static Scanner sc = new Scanner(System.in);

		// Taking the String data n returning
		public static String getString() throws Exception {

			return sc.next();

		}

		// Taking the integer data n returning
		public static int getInt() throws Exception {

			return sc.nextInt();

		}

		public static long getLong() throws Exception {

			return sc.nextLong();

		}
		// Taking the double data n returning
		public static double getDouble() throws Exception {

			return sc.nextDouble();

		}

		// Taking the float data
		public static float getFloat() throws Exception {

			return sc.nextFloat();

		}

		// Taking the boolean data
		public static boolean getBoolean() throws Exception {

			return sc.hasNext();

		}
		//declaring a json array to strore all elements in data
		public static JSONArray readFile() throws Exception {
			JSONParser jsonParser = new JSONParser();
			FileReader reader = new FileReader("stock.json");
			// Read JSON file
			JSONArray obj = (JSONArray) jsonParser.parse(reader);
			return obj;
		}

		public static void writeIntoFile(JSONArray array)  {
			// TODO Auto-generated method stub

			try {
				FileWriter write=new FileWriter("Stock.json");
				write.write(array.toJSONString());
				write.flush();
				write.close();
				System.out.println("file successfully copied...");
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
		@SuppressWarnings("unchecked")//adding data  to json object
		public static JSONObject addData(String name,double share,double price) {
			// TODO Auto-generated method stub
			JSONObject json1= new JSONObject();
			json1.put("CompanyName",name);
			json1.put("NoofShares", share);
			json1.put("Shareprice",price);
			return json1;
		}
	}


