/* 
 * @purpose : Demonstrate two dimensional array
 * @ file   : TwoDimArray.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Functionalprogramming;

import java.io.PrintWriter;
import com.bridgelabz.utility.Utility;

public class TwoDimArray {
	//two dimensional integer array
	public static int[][] arrint(int m, int n) {
		int arr[][] = new int[m][n];
		System.out.println("Integer array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = Utility.getint();
			}
		}
		return arr;
	}
   //two dimensional boolean array
	public static String[][] arrayBoolean(int m, int n) {
		String str[][] = new String[m][n];
		System.out.println("Boolean Array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				str[i][j] = Utility.getString();
			}
		}
		return str;
	}
  // two dimensional double array
	public static double[][] arraydouble(int m, int n) {
		double b[][] = new double[m][n];
		System.out.println("double array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = Utility.getDouble();
			}
		}
		return b;
	}
// method to display two dimensional arrays of integer,boolean,double
	public static void display(int[][] arr,String[][] str,double[][] b,int m,int n)
	{
		System.out.println();
		PrintWriter printWriter=new PrintWriter(System.out,true);
		printWriter.println("two dimensional integer array:");
		for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		printWriter.print(arr[i][j]+ " ");
        	}
        	printWriter.println();
        }
		printWriter.println("two dimensional boolean array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				printWriter.print(str[i][j]+" ");
			}
			printWriter.println();
		}
	   printWriter.println("two dimensional double array:");
	   for(int i=0;i<m;i++)
       {
       	 for(int j=0;j<n;j++)
       	{
       		printWriter.print(b[i][j]+" ");
       	}
       	printWriter.println();
       }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[10][10];
	   System.out.println("enter size of row[10]:");
       int m=Utility.getint();
       System.out.println("enter size of column[10]:");
       int n=Utility.getint();
       System.out.println("enter "+m*n+" elements:");
       int [][]  arr1=arrint(m,n);
       String[][]  str=arrayBoolean(m,n);
       double [][] b=arraydouble(m,n);
       //calling display function
       display(arr1,str,b,m,n);
	}
}

       
