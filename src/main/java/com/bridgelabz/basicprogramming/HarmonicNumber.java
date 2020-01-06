package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {
	//main method
public static void main(String[] args){
System.out.println("enter number to print nth harmonic:");
int n=Utility.getint();
harmonic(n);
}
//harmonic=1+1/1+1/2+1/3+....+1/n
public static void harmonic(int n)
{
	float harmonic=1;

  for(int i=2;i<n;i++)
  {
	  harmonic+=(float)  1/i;
  }
  System.out.println(harmonic);
}
}


