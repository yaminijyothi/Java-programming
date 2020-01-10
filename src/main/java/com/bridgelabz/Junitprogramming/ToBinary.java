/* 
 * @purpose : convert decimal number to binary conversion
 * @ file   : ToBinary.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Junitprogramming;

import com.bridgelabz.utility.Utility;

public class ToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("enter decimal number:");
  int dec=Utility.getint();
  String  binary=Integer.toBinaryString(dec);
  System.out.println(binary);
	}

}
