/*purpose : Hashing fuction using linkedlist.
File    : Hashing.java*/
package com.bridgelabz.DatastructurePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Hashing {


	List<Integer> list[]=new LinkedList[11];
	public Hashing()throws FileNotFoundException
	{
		File file =new File("/home/user/Desktop/int.txt");
		FileReader reader=new FileReader(file);
		BufferedReader br=new BufferedReader(reader);
		int[] a=new int[10];
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			int i=0;
			a[i]=sc.nextInt();
			System.out.println(a[i]+"");
			i++;
		}
		for(int i=0;i<a.length;i++)
		{
			int rem =a[i]%11;
			list[rem]=new LinkedList<Integer>();
			if(list[rem]==null) {
				list[rem].add(a[i]);
			}
			else {
				list[rem].add(a[i]);
			}
		}
		for(int i=0;i<11;i++)
		{
			System.out.println(i);
			if(list[i]!=null) {
				System.out.println(list[i]);
			}
		}
	}
	//main method
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Hashing hs=new Hashing();
	}
}