package com.bridgelabz.oops.StockManagement.Service;

import org.json.simple.JSONObject;
//implemented by Serviceimplementation 
public interface Service {
	JSONObject createJsonFile();
	void addShares() throws Exception;
	void displayItems();
	void calculate();
	void removeItem();
	void companies();
	void addProducts();
}
