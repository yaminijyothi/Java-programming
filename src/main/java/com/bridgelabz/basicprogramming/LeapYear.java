package com.bridgelabz.basicprogramming;


import com.bridgelabz.utility.Utility;
public class LeapYear {
  public static void main(String[] args)
  {
	  System.out.println("enter the year :");
	  int n=Utility.getint();
	  if(n>999) {
	if(((n%4==0)&&(n%100!=0))||(n%400==0))
	{
		System.out.println("leap year");
	}
	else {
		System.out.println("not leap year");
	}
	  }
	  else {
		  System.out.println("year should be in four digits only");
  }
  }
}
