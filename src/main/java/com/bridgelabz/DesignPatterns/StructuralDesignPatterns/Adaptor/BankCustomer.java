
package com.bridgelabz.DesignPatterns.StructuralDesignPatterns.Adaptor;

import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard {
Scanner sc=new Scanner(System.in);

@Override
public void giveBankDetails() {
System.out.println("enter account bank name:");
String bankName=sc.next();
System.out.println("enter account holder:");
String accHolderName=sc.next();
System.out.println("enter account number:");
String acNumber=sc.next();
setAcNumber(acNumber);  
setBankName(bankName); 
setAccHolderName(accHolderName);
}
@Override
public String getCreditCard() {
	 String accNumber=getAcNumber();  
	 String accHolderName=getAccHolderName();  
	   String bankname=getBankName();  
	          
	   return ("The Account number "+accNumber+" of "+accHolderName+" in "+bankname+" bank is valid and authenticated for issuing the credit card. ");  
}
}
