/* 
 * @purpose : searching ur number in a given range
 * @ file   : SearchN.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Algorithmprograms;

import com.bridgelabz.utility.Utility;

public class SearchN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the range:");
		int range=Utility.getint();
		int[] arr=new int[range];
		for(int i=0;i<range;i++)
		{
			arr[i]=i;
		}
		findNumber(arr);
	}
	public static void findNumber(int arr[])
	{
		int low=0;
		int high=arr.length;
		while(low<=high)
		{
			int mid=(low+high)/2;
			System.out.println("If "+arr[mid]+" is your number y or n");
			String x=Utility.getString();
			if(x.equalsIgnoreCase("n"))
			{
				System.out.println("If "+arr[mid]+" is greaterthan your number y or n");
				String y=Utility.getString();
				if(y.equalsIgnoreCase("y"))
					low=mid+1;
				else
					high=mid-1;
			}else {
				System.out.println("your number is found:"+arr[mid]);
				break;
			}
		}
	}
}