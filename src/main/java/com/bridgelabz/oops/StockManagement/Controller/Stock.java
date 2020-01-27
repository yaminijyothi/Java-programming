package com.bridgelabz.oops.StockManagement.Controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.oops.StockManagement.Exception.InvalidChoice;
import com.bridgelabz.oops.StockManagement.Service.FactoryClass;
import com.bridgelabz.oops.StockManagement.Service.Service;
import com.bridgelabz.oops.StockManagement.ServiceImplementation.ServiceImplementation;
import com.bridgelabz.oops.StockManagement.Utility.Utility;

@SuppressWarnings("unused")
public class Stock {
	//main method
public  static void  main (String[] args) {
	FactoryClass srvc = new FactoryClass();
	Service inventory = srvc.factoryMethod();
	int count = 0;
	do {
		System.out.println("1.To creat JsonFile");
		System.out.println("2.AddShares to company");
		System.out.println("3.DisplayShares of Company");
		System.out.println("4.Adding the company into the stock Market");
		System.out.println("5.Calculate the shares of company");
		System.out.println("6.Remove sharesholder From company");
		System.out.println("7.To Know the companies in stock Market");
		
		try {
			int choice = Utility.getInt();
			JSONObject json;
			JSONArray arr=new JSONArray();
			switch (choice) {
			case 1: //to create new file
			    json=inventory.createJsonFile();
			    arr.add(json);
				Utility.writeIntoFile(arr);
				break;
			case 2://adding shares to the company
				inventory.addShares();
				count++;
				break;
			case 3://displaying shares of company
				inventory.displayItems();
				count++;
				break;
			case 4://adding the company to the market
				inventory.addProducts();
				count++;
				break;
			case 5://calculating shares of company
				inventory.calculate();
				count++;
				break;
			case 6://remove the shareholders of the comapany
				inventory.removeItem();
			    count++;
			    break;
			case 7://companies of the stockmarket
				inventory.companies();
				break;
			
			default:
				throw new Exception();
			}
			System.out.println();
			System.out.println("continue(1)"+"\t"+"Exit(0)");
			int choice1 = Utility.getInt();
			switch (choice1) {
			case 1:
				continue;

			case 0:
				System.exit(0);
				break;
		    default:throw new Exception();
			}
		} catch (Exception e) {
			
			System.out.println("Not a proper input");
		}
	} while (count >= 1);
}
}
