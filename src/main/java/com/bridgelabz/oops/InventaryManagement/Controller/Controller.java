/*purpose : Inventarymanagement of rice,wheat,pulses using json
file    : Controller.java*/
package com.bridgelabz.oops.InventaryManagement.Controller;
import com.bridgelabz.oops.InventaryManagement.Exceptions.InvalidChoice;
import com.bridgelabz.oops.InventaryManagement.Implementation.ServiceImplementation;
import com.bridgelabz.oops.InventaryManagement.Service.FactoryClass;
import com.bridgelabz.oops.InventaryManagement.Utility.Utility;

@SuppressWarnings("unused")
public class Controller {

	public static void main(String[] args) {
		FactoryClass srvc = new FactoryClass();
		ServiceImplementation inventory = srvc.factoryMethod();
		int c = 0;
		do {
			System.out.println("1.To creat JsonFile");
			System.out.println("2.AddItems to Product");
			System.out.println("3.DisplayItems of Product");
			System.out.println("4.Calculate the price");
			System.out.println("5.Remove Item From Product");
			System.out.println("6.To Know the Products in Inventory");
			int ch;
			try {
				ch = Utility.getInt();
				switch (ch) {
				case 1: 
					inventory.createJsonFile();
					break;
				case 2:
					inventory.addItems();
					c++;
					break;
				case 3:
					inventory.displayItems();
					c++;
					break;
				case 4:
					inventory.calculate();
					c++;
					break;
				case 5:
					inventory.removeItem();
				    c++;
				    break;
				case 6:
					inventory.inventoryProducts();
					break;
				
				default:
					//throw new InvalidChoice();
				}
				System.out.println();
				System.out.println("1=>continue"+"\t"+"0=>Exit");
				int ch1 = Utility.getInt();
				switch (ch1) {
				case 1:
					continue;

				case 0:
					System.exit(0);
					break;
			  // default:throw new InvalidChoice();
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		} while (c >=1);
	}
}