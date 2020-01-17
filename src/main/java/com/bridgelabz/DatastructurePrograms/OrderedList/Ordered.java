/*purpose : to read file and sorted integers, after that searching,adding or remove of numbers can be done.
 * File   : Ordered.java
 */
package com.bridgelabz.DatastructurePrograms.OrderedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
	public class Ordered {
		//main method
		public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			Utility list=new Utility();
			String fileData;
			String path = "/home/user/Desktop/int.txt";
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
			System.out.println("enter the number to search");
			String num = sc.next();
			boolean value = list.search(num);
			if (value == false) {
				list.insert(num);
			}
			String out = list.show();
			System.out.println("data after deleting given number:");
			list.sort(out);
			dataOut(out);

			sc.close();

		}
		//storing elements in a file after deleting or inserting in a file
		private static void dataOut(String outData) {
			// TODO Auto-generated method stub
			String path2="/home/user/Desktop/int.txt";
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


