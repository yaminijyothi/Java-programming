package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.Utility;

public class Flipcoin {
	public static void main(String[] args)
	{
		System.out.println("enter a   number to flip a coin:");
		int n=Utility.getint();
		int heads=0;
		int tails=0;
		int count=1;
		double randNum=Math.random();
		while(count<randnum) {
		if(Math.random()<0.5)
		{
			tails++;
		}
		else
		{
			heads++;
		}
		System.out.println("tails="+tails);
		System.out.println("heads="+heads);
	}
}
