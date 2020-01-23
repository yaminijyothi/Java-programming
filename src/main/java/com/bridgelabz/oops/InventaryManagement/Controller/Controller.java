/*purpose : Inventarymanagement of rice,wheat,pulses using json
file    : Controller.java*/
package com.bridgelabz.oops.InventaryManagement.Controller;
import com.bridgelabz.oops.InventaryManagement.Implementation.ServiceImplementation;
import com.bridgelabz.oops.InventaryManagement.Service.FactoryClass;
import com.bridgelabz.oops.InventaryManagement.Utility.Utility;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryClass fc = new FactoryClass();
		ServiceImplementation ser = fc.factoryMethod();
		int count = 0;
		do {
			System.out.println("Options:"+"\n"+"1.Add items"+"\n"+"2.Display details");
			int ch;
			try {
				ch = Utility.getInt();
				switch (ch) {
				case 1:
					ser.add();
					count++;
					break;
				case 2:
					ser.display();
					count++;
				}
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 0 exit");
				System.out.println("Enter ur option:");
				int ch1 = Utility.getInt();
				switch (ch1) {
				case 1:
					continue;

				case 0:
					System.exit(0);
					break;
			    default:System.out.println("enter valid option");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (count >= 1);
	}

}
