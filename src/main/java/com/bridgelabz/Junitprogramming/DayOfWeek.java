/* 
 * @purpose : to get which day of week by giving date
 * @ file   : DayOfWeek.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Junitprogramming;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter month:");
		int m=Utility.getint();
		System.out.println("Enter date:");
		int d=Utility.getint();
		System.out.println("Enter year:");
		int y=Utility.getint();
		int y1=y-(14-m)/12;
		int x=y1+y1/4-y1/100+y1/400;
		int  m1=m+12*((14-m)/12)-2;
		int d1=(d+x+31*m1/12)%7;
		//we using switch case to print day 
		switch (d1) {
		  case 0:
		    System.out.println("Sunday");
		    break;
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  
			}
	}
}