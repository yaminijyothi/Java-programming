package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.Utility;

public class Poweroftwo {
	public static void main(String[] args)
	{
		System.out.println("enter a number :");
		int n=Utility.getint();
		poweroftwo(n);
	}
	public static void poweroftwo(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(2+"^"+i+"="+2*i);
		}
	}

}


