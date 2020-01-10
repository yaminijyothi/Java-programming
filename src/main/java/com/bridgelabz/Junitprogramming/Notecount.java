/* 
 * @purpose : printing number of notes available in vending machine 
 * @ file   : Notecount.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Junitprogramming;

import com.bridgelabz.utility.Utility;

public class Notecount {

	// TODO Auto-generated method stub
	public static void Currency(int amount) 
	{ 
		int[] notes = new int[]{ 2000, 500, 100, 50, 10, 5, 1 }; 
		int[] noteCount = new int[7]; 

		for (int i = 0; i < 7; i++) { 
			if (amount >= notes[i]) { 
				noteCount[i] = amount / notes[i]; 
				amount = amount - noteCount[i] * notes[i]; 
			} 

		} 

		// Print notes 
		System.out.println("Currency Count:"); 
		for (int i = 0; i < 7; i++) { 
			if (noteCount[i] != 0) { 
				System.out.println(notes[i] + " : "
						+ noteCount[i]); 
			} 
		} 
	} 
	//main method
	public static void main(String argc[]){ 
		System.out.println("enter amount:");
		int amount=Utility.getint();
		Currency(amount); 		
	} 
}


