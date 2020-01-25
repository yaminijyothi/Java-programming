package com.bridgelabz.oops.InventaryManagement.Implementation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.oops.InventaryManagement.Utility.Utility;
//the class implements the service class

@SuppressWarnings("unused")
public class ServiceImplementation implements service {
	// to display the data
	JSONArray array = new JSONArray();
	JSONObject json1 = new JSONObject();
	private JSONArray list = new JSONArray();



	@SuppressWarnings("unchecked")
	public JSONObject createJsonFile() {

		double weight=0.0;
		double price=0.0;
		System.out.println("enter the Product Name");
		String choice;
		try {
			choice = Utility.getString();
			JSONArray arr1 = new JSONArray();
			System.out.print("enter the  Name:");
			String name = Utility.getString();
			System.out.print("enter the weight in kg:");
			weight = Utility.getDouble();
			System.out.print("enter the price in rs:");
			price = Utility.getDouble();
			JSONObject json = Utility.addData(name, weight, price);
			arr1.add(json);
			json1.put(choice, arr1);

			list.add(json1);
			Utility.writeIntoFile(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json1;
	}
	@SuppressWarnings("unchecked")
	@Override
	public void addItems() throws Exception {
		double weight=0.0;
		double price=0.0;
		JSONArray obj = Utility.readFile();
		System.out.println(obj);

		try {


			inventoryProducts();
			System.out.println("enter ur choice");
			String choice = Utility.getString();
			System.out.println("keys::" + obj);
			if (obj.isEmpty()) {
				System.out.println("****Product not Exist In Inventory*****");
				JSONObject json = createJsonFile();
				obj.add(json);
				Utility.writeIntoFile(obj);
				System.out.println("****"+obj);
			}
			else {	

				for (Object data : obj) {
					JSONObject data2 = (JSONObject) data;
					JSONArray arr=new JSONArray();
					if (data2.containsKey(choice)) {
						System.out.println("value:"+data2.containsKey(choice));
						arr = (JSONArray) data2.get(choice);
						System.out.println("enter the " + choice + " Name");
						String name = Utility.getString();
						System.out.println("enter the " + choice + " weight in kg");
						weight = Utility.getDouble();
						System.out.println("enter the " + choice + " price in rs");
						price = Utility.getDouble();
						if (arr != null)
							arr.add(Utility.addData(name, weight, price));
						json1.put(choice, arr);
						list.add(json1);

					} else {
						list.add(data2);
					}

				}
				if(!obj.contains(choice)) {
					System.out.println("****");
				}

				Utility.writeIntoFile(list);
			}

		} catch (Exception ae) {
			System.out.println("Error>>>");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void displayItems() {
		System.out.println("Rice" + "\t" + "Pulses" + "\t" + "" + "Wheat");
		System.out.println("enter ur choice");
		try {
			String choice = Utility.getString();
			JSONArray obj = Utility.readFile();
			obj.forEach((data) -> {
				JSONObject data2 = (JSONObject) data;
				JSONArray list = (JSONArray) data2.get(choice);
				if (list != null) {
					list.forEach((ls) -> {
						// for (Object ls : list) {
						JSONObject stt = (JSONObject) ls;
						System.out.println(stt.get("Name"));
						System.out.println(stt.get("weight"));
						System.out.println(stt.get("price"));
						System.out.println();
					});
				}

			});
		} catch (Exception e) {
			System.out.println("**error**");
		}

	}

	@Override
	public void calculate() {
		System.out.println("1.Rice" + "\t" + "2.Pulses" + "\t" + "3.Wheat");
		System.out.println("enter ur choice");
		try {
			// JSONArray arr= new JSONArray();
			String choice = Utility.getString();
			JSONArray obj = Utility.readFile();
			double weight = 0.0;
			double price = 0.0;
			for (Object data : obj) {
				JSONObject data2 = (JSONObject) data;
				JSONArray list = (JSONArray) data2.get(choice);
				if (list != null) {
					for (Object ls : list) {
						JSONObject stt = (JSONObject) ls;

						weight += (double) stt.get("weight");

						price += (double) stt.get("price");

					}
				}
			}
			double grandTotal = weight * price;
			System.out.println("GrantWeight:" + weight);
			System.out.println("GrantPrice:" + price);
			System.out.println("GrandTotal:" + grandTotal);
		} catch (Exception e) {
			System.out.println("error>>>>>");
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void removeItem() {
		// TODO Auto-generated method stub
		JSONArray obj;
		try {
			obj = Utility.readFile();
			System.out.println(obj);
			System.out.println("Rice" + "\t" + "Pulses" + "\t" + "" + "Wheat");
			System.out.println("enter ur choice");
			String choice = Utility.getString();

			for (Object data : obj) {
				JSONObject data2 = (JSONObject) data;
				//System.out.println("****111" + data2.containsKey(choice));
				if (data2.containsKey(choice)) {
					data2.remove(choice);
				} else {
					list.add(data2);
				}

			}
			Utility.writeIntoFile(list);

		} catch (Exception ae) {
			System.out.println("**Error**");
			ae.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void inventoryProducts() {
		System.out.println("*******Inventory product******");
		// TODO Auto-generated method stub
		JSONArray obj;
		try {
			obj = Utility.readFile();
			obj.forEach((data) -> {
				JSONObject data2 = (JSONObject) data;
				Set keys = data2.keySet();

				System.out.print(String.join("", keys)+"\t");

			});
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
