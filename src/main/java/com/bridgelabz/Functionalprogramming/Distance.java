/* 
* @purpose : Demonstrate the elapsed time in stopwatch
* @ file   : stopwatch.java
* @ author : yaminijyothi
*/
package com.bridgelabz.Functionalprogramming;

import com.bridgelabz.utility.Utility;

public class Distance {
   //main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter x value:");
     int x=Utility.getint();
     System.out.println("enter y value:");
     int y=Utility.getint();
     // to calculate the distance between two points
     double distance=Math.sqrt(x*x+y*y);
     System.out.println("Distance from ("+x+","+y+") to (0,0) is "+distance);
	}

}
