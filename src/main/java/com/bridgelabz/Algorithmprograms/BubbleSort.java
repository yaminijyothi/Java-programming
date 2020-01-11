/* 
 * @purpose : sorting the integers by using bubbleSort
 * @ file   : BubbleSort.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Algorithmprograms;

import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

		public class BubbleSort {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("enter size of array:");
				int n = Utility.getint();
				int a[] = new int[n];
				int i,j,temp;
				System.out.println("enter " + n + " elements:");
				for (i = 0; i < n; i++) {

					a[i] = Utility.getint();
				}
				
			sort(n,a);
}
			public static String sort(int n,int[] a) {
				
				for(int i=0;i<n;i++)
				{
					for(int j=1;j<n-i;j++)
					{
						if(a[j-1]>a[j])
						{
						int	temp=a[j-1];
							a[j-1]=a[j];
							a[j]=temp;
			  
				     	}
			     	}
				}
				String rev = Arrays.toString(a);
				return rev;
			}

		}
		