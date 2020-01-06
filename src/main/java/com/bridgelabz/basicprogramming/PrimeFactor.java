package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.Utility;

public class PrimeFactor {
public static void main(String[] args)
{
	System.out.println("enter the number:");
    int	n=Utility.getint();
    primefactor(n);
}
public static void primefactor(int n)
{
	
    for(int i=2;i<=n;i++)
{
    	while(n%i==0) {
    		System.out.println(i+"");
    		n=n/i; 
	}
}
	
}
}
