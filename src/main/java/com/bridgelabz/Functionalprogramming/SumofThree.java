/* 
 * @purpose : Demonstrate the sum of three integers is zero
 * @ file   : SumofThree.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Functionalprogramming;

import com.bridgelabz.utility.Utility;

public class SumofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        System.out.println("enter how many numbers you want to enter: ");
        int n=Utility.getint();
        System.out.println("enter "+n+" elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=Utility.getint();	
        }
        sumofthree(n,arr);
	}
	public static  int sumofthree(int n,int[]arr)
	{
		int i,j,k,count=0;
        //logic for sum of three integers equals to zero
        for(i=0;i<n;i++)
        {
        	for(j=i+1;j<n;j++)
        	{
        		for(k=j+1;k<n;k++)
        		{
        			if(arr[i]+arr[j]+arr[k]==0)
        			{
        				count++;
        				System.out.println(arr[i]+","+arr[j]+","+arr[k]);
        			}
        		}
        	}
        }
        //prints the number of triplets gives zero
        System.out.println(" number of triplets are:"+count);
        return count;
	}

}
