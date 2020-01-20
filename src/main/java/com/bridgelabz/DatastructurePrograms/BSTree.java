/*purpose : finding how many binarytrees are formed using no of nodes.
File    : BSTree.java*/
package com.bridgelabz.DatastructurePrograms;
import java.util.Scanner;
public class BSTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of nodes:");
		int num=sc.nextInt();
     for(int i=1;i<=num;i++)
     {
    	 System.out.println(i+":"+countTrees(i));
     }
	}
	public static int countTrees(int n)
	{
		int T[]=new int[n+1];
	   T[0]=1;
	   T[1]=1;
	   T[2]=2;
	   for(int i=3;i<=n;i++)
	   {
		   for(int j=0;j<i;j++)
		   {
			   T[i]=T[i]+T[j]*T[i-j-1];
		   }
	   }
	   return T[n];
	}
	

}
