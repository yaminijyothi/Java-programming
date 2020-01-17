/* purpose: display the calender of user input of month and year.
 * File   : Calender.java
 */
package com.bridgelabz.DatastructurePrograms;

public class Calender {
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		String[] months= {"","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		int[] day= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(month==2&&isLeap(year))
			day[month]=29;
		System.out.println("    MONTH:"+months[month]+"                 YEAR:"+year);
		System.out.println("SON\tMON\tTUS\tWED\tTHU\tFRI\tSAT");
		int d=day(month,1,year);
		for(int i=0;i<d;i++)
		{
			System.out.print("            ");
		}
		for(int i=1;i<=day[month];i++)
		{
			System.out.print(i+"\t");
			if((i+d)%7==0||i==day[month])
			{
				System.out.println();
			}	
		}
	}   
	//finding day using formula
	private static int day(int month, int day, int year) {
		// TODO Auto-generated method stub
		int y=year-(14-month)/12;
		int x=y+y/4-y/100+y/400;
		int m=month+12*((14-month)/12)-2;
		int d=(day+x+(31*m)/12)%7;
		return d;
	}
	//checking if is leap or not
	private static boolean isLeap(int year) {
		// TODO Auto-generated method stub
		if  ((year % 4 == 0) && (year % 100 != 0)&&(year % 400 == 0))
			return true;
		else
			return false;
	}

}
