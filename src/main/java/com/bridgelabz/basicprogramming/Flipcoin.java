package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.Utility;

public class Flipcoin {
	public static void main(String[] args)
	{
		int heads=0;
		int tails=0;
		int count=1;
		System.out.println("enter a number to flip a coin:");
		int n=Utility.getint();
		while(count<=n) {
			double randNum=Math.random();
			if(randNum<0.5)
			{
				tails++;
				System.out.println("tails="+tails);
			}
			else
			{
				heads++;
				System.out.println("heads="+heads);
			}
			count++;
		}
		System.out.println("percentage of tails="+(tails/10)*100);
		System.out.println("percentage of heads="+(heads/10)*100);
	}
}
