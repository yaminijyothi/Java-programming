/* 
 * @purpose : Demonstrate the temperature in celsius
 * @ file   : TemperatureConversion.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Junitprogramming;

import com.bridgelabz.utility.Utility;

public class TemperatureConverstion {
       //main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter temperature  in fahrenhiet:");
		double F=Utility.getDouble();
		//formula to convert temperature to celsius
		double c=(F-32)*5/9 ;
		System.out.println("temperature in celsius:"+c);
	}
}


	
