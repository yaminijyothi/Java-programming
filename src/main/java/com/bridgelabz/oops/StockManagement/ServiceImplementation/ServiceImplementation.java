package com.bridgelabz.oops.StockManagement.ServiceImplementation;

import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgelabz.oops.StockManagement.Service.Service;
import com.bridgelabz.oops.StockManagement.Utility.Utility;
//implementation class implements the service class
public class ServiceImplementation implements Service {
//declaring json object and json array
	private JSONObject json1 = new JSONObject();
	private JSONArray list = new JSONArray();

	@SuppressWarnings("unchecked")
	//creating new Json file
	public JSONObject createJsonFile() {
		JSONObject json1 = new JSONObject();
		long NumOfShares = 0;
		long price = 0;
		String name = null;
		System.out.println();
		System.out.println("enter the company Name");
		try {
			String choice = Utility.getString();
			JSONArray arr1 = new JSONArray();
			System.out.print("enter the  ShareName:");
			name = Utility.getString();
			System.out.print("enter the NumOfShares:");
			NumOfShares = Utility.getLong();
			System.out.print("enter the Shareprice in rs:");
			price = Utility.getLong();
			JSONObject json = Utility.addData(name, NumOfShares, price);
			arr1.add(json);
			json1.put(choice, arr1);
		} catch (Exception e) {
			System.out.println("Not Proper value");
		}
		return json1;
	}

	@SuppressWarnings("unchecked")
	@Override
	//adding shares to the  existing company
	public void addShares() throws Exception {
		long numOfShares = 0;
		long sharePrice = 0;
		// Reading thae json file
		list = Utility.readFile();

		try {
			companies();// prints companyName in stockMarket
			JSONArray arr = null;
			if (list.isEmpty()) { // if files is empty.
				System.out.println("****Product not Exist In Inventory*****");
				JSONObject json = createJsonFile();
				list.add(json);
				Utility.writeIntoFile(list);
				list.clear();
				json1.clear();
			} else {
				System.out.println("enter ur choice");
				String choice = Utility.getString();
				for (Object data : list) {
					// Retriveing the json Object from the Common json Array
					JSONObject data2 = (JSONObject) data;
					arr = new JSONArray();
					 // checking the user choice which is contain as JsonObject or not ...If its
					 // present adding the data into that particular Json object...
					if (data2.containsKey(choice)) {
						arr = (JSONArray) data2.get(choice);
						System.out.println("enter the " + choice + " Name");
						String name = Utility.getString();
						System.out.println("enter the " + choice + " NumOfShares");
						numOfShares = Utility.getLong();
						System.out.println("enter the " + choice + " Shareprice in rs");
						sharePrice = Utility.getLong();
						if (arr.contains(choice))
							arr.remove(choice);
						arr.add(Utility.addData(name, numOfShares, sharePrice));
						break;
					}

				}
				Utility.writeIntoFile(list);
				list.clear();// clearing the data from array after writing data into file.
			}

		} catch (Exception ae) {
			System.out.println("Error*");
		}
	}

	@SuppressWarnings("unchecked")
	public void addProducts() {
		try {
			System.out.println("Don't enter this Products..");
			companies();// gives the products in inventory
			list = Utility.readFile();// Reading the updated file
			JSONObject json = createJsonFile();
			if (json != null) {
				list.add(json);
			} else {
				System.exit(0);
			}
			Utility.writeIntoFile(list);
			list.clear();
			System.out.println("cleared::" + list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Exist...");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	//displaying products of company
	public void displayItems() {
		companies();// prints companyName in stockMarket
		try {
			JSONArray obj = Utility.readFile();
			System.out.println("enter ur choice");
			String choice = Utility.getString();
			obj.forEach((data) -> {
				JSONObject data2 = (JSONObject) data;
				JSONArray list = (JSONArray) data2.get(choice);
				if (list != null) {
					list.forEach((ls) -> {
						// for (Object ls : list) {
						JSONObject obj1 = (JSONObject) ls;
						System.out.println("ComapnyName:" + obj1.get("companyName"));
						System.out.println("NumberOfShares:" + obj1.get("numOfShares"));
						System.out.println("Shareprice:" + obj1.get("sharePrice"));
						System.out.println();
					});
				}

			});
		} catch (Exception e) {
			System.out.println("error*");
		}

	}

	@Override
	//calculate the shares of the company
	public void calculate() {
		companies();// prints companyName in stockMarket
		System.out.println("enter ur choice");
		try {
			String choice = Utility.getString();
			JSONArray obj = Utility.readFile();
			double NumOfShares = 0;
			double price = 0;
			for (Object data : obj) {
				// Reading JsonObject from JsonArray
				JSONObject data2 = (JSONObject) data;
				JSONArray list = (JSONArray) data2.get(choice);
				if (list != null) {
					for (Object ls : list) {
						JSONObject jo = (JSONObject) ls;

						NumOfShares += (double) jo.get("numOfShares");

						price += (double) jo.get("sharePrice");

					}
				}
			}
			double grandTotal = NumOfShares * price;
			System.out.println("GrantWeight:" + NumOfShares);
			System.out.println("GrantPrice:" + price);
			System.out.println("GrandTotal:" + grandTotal);
		} catch (Exception e) {
			System.out.println("error*");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	//removing share holders of the company
	public void removeItem() {
		// TODO Auto-generated method stub
		JSONArray obj;
		try {
			obj = Utility.readFile();
			companies();// returns produts in inventory
			System.out.println("enter ur choice");
			String choice = Utility.getString();

			for (Object data : obj) {
				JSONObject data2 = (JSONObject) data;
				if (data2.containsKey(choice)) {
					data2.remove(choice);
					System.out.println("Removed...");
				}
				list.add(data2);

			}
			Utility.writeIntoFile(list);
			list.clear();

		} catch (Exception ae) {
			System.out.println("Error*");
			ae.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override//companies in the market
	public void companies() {
		JSONArray obj;
		try {
			obj = Utility.readFile();
			obj.forEach((data) -> {
				JSONObject data2 = (JSONObject) data;
				@SuppressWarnings("rawtypes")
				Set keys = data2.keySet();
				System.out.print(String.join("", keys) + "\t");
			});
			System.out.println();
		} catch (Exception e) {
			System.out.println("Not a Proper File");
		}

	}
}

