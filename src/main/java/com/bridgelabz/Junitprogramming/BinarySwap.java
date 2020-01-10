/* 
 * @purpose : to swap the nibbles of byte code
 * @ file   : BinarySwap.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Junitprogramming;

import com.bridgelabz.utility.Utility;

public class BinarySwap {
    //method to swap
	public static int swap(int n)
	{
		return((n & 0x0F)<<4 | (n& 0xF0)>>4 );
    }
	public static void main(String[] args)
	{

		int n=100;
		String binary=Integer.toBinaryString(n);
		System.out.println(swap(n));
	}
}


