/* 
 * @purpose : Demonstrate to search a word using binary
 * @ file   : BinarySort.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Algorithmprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BinarySearch {
	// main method
	static String str="my name is yamini";
	static String[] s=str.split(" ");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length;i++){
			//System.out.println("before sort::"+a[i]);
			String str=Utility.sort(s[i]);
			s[i]=str;
			//System.out.println("after sort::"+a[i]);
		}
		System.out.println("Key Found at : "+stringBinarySearch()+" position");
	}
	//method to do binary search
	public static int stringBinarySearch() {
		String key = "name";
		String sortkey;
		sortkey=Utility.sort(key);
		System.out.println("sorted key:"+sortkey);
		int min = 0;
		int max = s.length-1;
		int mid;
		while (min <= max) {
			mid = (min + max) / 2;
			if (s[mid].compareTo(sortkey) < 0) {
				min = mid + 1;
			}
			else if (s[mid].compareTo(sortkey) > 0) {
				max = mid - 1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}

