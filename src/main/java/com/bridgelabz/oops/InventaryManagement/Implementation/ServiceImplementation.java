package com.bridgelabz.oops.InventaryManagement.Implementation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.oops.InventaryManagement.Utility.Utility;
//the class implements the service class
public class ServiceImplementation implements service {
//to add the data
	public void add() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("1.Rice "+"\n"+"2.wheat"+"\n"+"3.pulses");
		System.out.println("Enter ur choice");
		int ch =Utility.getInt();
		switch(ch) {
		case 1:System.out.print("Name  :");
		String name=Utility.getString();
		System.out.print("weight:");
		long weight=Utility.getLong();
		System.out.println("price ");
		long price=Utility.getLong();
		Utility.rice(name,weight,price);
		break;
		case 2:System.out.print("Name  :");
		String wname=Utility.getString();
		System.out.print("weight:");
		long wweight=Utility.getLong();
		System.out.println("price :");
		long wprice=Utility.getLong();
		Utility.wheat(wname,wweight,wprice);
		break;
		default : System.out.println("please enter valid option");
		}
	}


// to display the data
	@SuppressWarnings("unchecked")
	public void display() {
		// TODO Auto-generated method stub
		JSONParser Parser = new JSONParser();

		try (FileReader file = new FileReader("/home/user/Desktop/inventory.json"))
		{

			//Read JSON file
			JSONArray obj = (JSONArray) Parser.parse(file);

			obj.forEach((data)->Utility.read((JSONObject) data));//read data in utility function

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
