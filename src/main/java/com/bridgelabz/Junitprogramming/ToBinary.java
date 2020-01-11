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
		int n=Utility.getint();
		System.out.println(DecToBin(n));
	}
	public static String DecToBin(int n)
	{
		if(n==0)
			return "0";
		String bin="";
			while(n>0)
			{
				bin=((n & 1)==0?'0':'1')+bin;
				n=n/2;
			}
		return bin;
	}

}

