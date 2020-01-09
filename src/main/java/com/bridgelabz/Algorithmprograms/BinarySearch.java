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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("/home/user/file.txt");
			BufferedReader br = new BufferedReader(fr);
			int count = 0, flag = 0;
			String data;
			System.out.println("enter searching word:");
			String word = Utility.getString();
			while ((data = br.readLine()) != null) {
				String[] ch = data.split(" ");
				for (int i = 0; i < ch.length; i++) {
					flag++;
					if (ch[i].equalsIgnoreCase(word)) {
						count++;
					}
				}
			}
			// if given word found
			if (count != 0) {
				System.out.println("word found");
			}
			// if not found
			else {
				System.out.println("not found");
			}
			System.out.println("number of times word can be repeated:" + count);
			System.out.println("total words:" + flag);
		} catch (Exception e) {
			System.out.println("enter specific  word");

		}
	}

}