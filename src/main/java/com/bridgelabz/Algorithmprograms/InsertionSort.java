/* 
 * @purpose : Demonstrate insertion sort of string array
 * @ file   : InsertionSort.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Algorithmprograms;

import java.util.ArrayList;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "python", "java", "dotnet", "springs", "script" };
		int count = 0;
		String sortedArray[] = sortsub(arr, arr.length);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}
//sorting technique
	public static String[] sortsub(String array[], int f) {
		String temp = "";
		for (int i = 0; i < f; i++) {
			for (int j = i + 1; j < f; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

}
