//purpose : to  implemented facade pattern
//File    :FacadePattern.java
package com.bridgelabz.DesignPatterns.StructuralDesignPatterns.Facade;
import java.util.Scanner;

public class FacadePattern {
	public static void main(String[] args) {
		int  choice;  
		do{       
			System.out.print("========= Mobile Shop ============ \n");  
			System.out.print("            1. IPHONE.              \n");  
			System.out.print("            2. SAMSUNG.              \n");  
			System.out.print("            3. Exit.                     \n");  
			System.out.print("Enter your choice: ");  
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			ShopKeeper sk=new ShopKeeper();  

			switch (choice) {  
			case 1:  
				sk.shop(new Iphone());  
				break;  
			case 2:  
				sk.shop(new Samsung());        
				break;   
			case 3:
				System.exit(0);
			default:  
				System.out.println("Nothing You purchased");  
				return;  
			}  

		}while(choice!=4);  
	}  
}

