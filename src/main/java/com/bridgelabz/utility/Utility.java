/* 
* @purpose : Demonstrate the utility function
* @ file   : Utility.java
* @ author : yaminijyothi
*/
package com.bridgelabz.utility;
import java.util.Scanner;
public class Utility {
	static Scanner sc=new Scanner(System.in);
	
	public static String getString() {
		return sc.next();
	}
	public static int getint() {
		return sc.nextInt();
	}
	public static  double getDouble() {
		return sc.nextDouble();
		}
   public static float getfloat() {
	   return sc.nextFloat();
   }
   public static long getLong() {
	   return sc.nextLong();
   }
   public static boolean getBoolean() {
	   return sc.nextBoolean();
   }
   
}
