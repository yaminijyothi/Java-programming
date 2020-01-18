package com.bridgelabz.DatastructurePrograms.PrimeAnagramStack;

import java.util.Arrays;

public class MyStack {
	public static int length;
	public static Node top;
	public MyStack()//declaring stack is null
	{
		length=0;
		top=null;
	}
	//putting data in stack
	public static void push(int data)
	{
		Node ns=new Node(data);
		ns.setnext(top);
		top=ns;
		length++;
	}
	//if it is empty
	public boolean isEmpty() {
		return (length==0);
	}
	//pop the data
	public int pop() {
		int res=top.getData();
		top=top.getNext();
		length--;
		return res;
	}
	//size of the stack
	public int  size() {
		return length;
	}
	//converting to string
	public String toString(){
		String str="";
		Node ns=top;
		while(ns!=null)
		{
			str=str+ns.toString();
		}
		return str;
	}
	//display method
	public String show() {
		Node ns=top;
		String data=" ";
		while(ns.next!=null)
		{
			System.out.println(ns.data);
			data+=ns.data+"";
			ns=ns.next;
		}
		System.out.println(ns.data);
		return data;
	}
	//check the number whether integer or not
	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
	//check the number whether is anagram or not
	public static boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}
}

