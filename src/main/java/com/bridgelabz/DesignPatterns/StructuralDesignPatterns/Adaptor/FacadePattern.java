//purpose : implemented Facadedesign pattern
//File    :FacadePattern.java
package com.bridgelabz.DesignPatterns.StructuralDesignPatterns.Adaptor;

public class FacadePattern {
public static void main(String[] args) {
	CreditCard credit=new BankCustomer();  
	  credit.giveBankDetails();  
	  System.out.print(credit.getCreditCard());  
}
}
