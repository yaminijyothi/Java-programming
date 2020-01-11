/* 
 * @purpose : Demonstrate the  sorting techniques by using generics
 * @ file   : Generic.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Algorithmprograms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class Generic {
	 public static void main(String[] args) 
	  {
		 String str = "yamini";
			StringSort(str);
			integerSort();
		}
	//String sorting
	public static boolean StringSort(String str) {
		
		char s[]=str.toCharArray();
		int i,j;
		char temp;
		System.out.println("String before sorted:"+str);
		for(i=0;i<s.length;i++)
		{
			for(j=1;j<s.length;j++)
			{
				if(s[j-1]>s[j])
				{
					temp=s[j-1];
					s[j-1]=s[j];
					s[j]=temp;

				}
			}
		}
		System.out.print("string after sorted:");
		for(i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
		System.out.println();
		return true;
	}
	//integer sorting
	public static boolean integerSort() {
		int a[]= {3,5,4,2,1};
		System.out.print("Integer before sorted:");

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.print("Integer after sorted:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					}
			     }
		     }

		for(int i=0;i<a.length;i++)
		{
             System.out.print(a[i]);
		}
		return true;
	 
	}
}
	