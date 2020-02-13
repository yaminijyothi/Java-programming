//purpose : implemented Adaptordesign pattern
//File    :FacadePattern.java
package com.bridgelabz.DesignPatterns.StructuralDesignPatterns.Adaptor;

public class AdaptorPattern {
public static void main(String[] args) {
	CreditCard credit=new BankCustomer();  
	  credit.giveBankDetails();  
	  System.out.print(credit.getCreditCard());  
}
}
