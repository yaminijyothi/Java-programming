/* 
 * @purpose :  Read a file and word given from user to be search ,if it found then remove from that file
 *             if it is not found add to that file using UnOrderedLinkedlist.
 *             printing file after changing insert or remove the word
 * @ file   :  UnOrderedLinkedList.java
 */
package com.bridgelabz.DatastructurePrograms.UnOrderedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import com.bridgelabz.DatastructurePrograms.UnOrderedList.*;
public class UnOrderedLinkedList {
	//main method
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Utility list= new Utility();
		String fileData;
		String path = "/home/user/Desktop/Test.txt";
		//to read a text file
		BufferedReader file = new BufferedReader(new FileReader(path));
		while ((fileData = file.readLine()) != null) {
			String[] data = fileData.split(" ");
			for (int i = 0; i < data.length; i++) {
				list.insert(data[i]);

			}
		}
		System.out.println("given data");
		list.show();
		System.out.println("enter the word to search");
		String word = sc.next();
		boolean value = list.search(word);
		if (value == false) {
			list.insert(word);
		}
		System.out.println("data after deleting");
		String out = list.show();
		dataOut(out);

		sc.close();

	}
	//storing elements in a file after deleting or inserting in a file
	private static void dataOut(String outData) {
		// TODO Auto-generated method stub
		String path2="/home/user/Desktop/Test.txt";
		File file1 = new File(path2);
		FileWriter fr = null;
		try {
			fr = new FileWriter(file1);
			fr.write(outData +" ");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


