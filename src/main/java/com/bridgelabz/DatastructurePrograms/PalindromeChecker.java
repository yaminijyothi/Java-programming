/*purpose : PalindromeChecker using deque.
File    : PalindromeChecker.java*/
package com.bridgelabz.DatastructurePrograms;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//declaring a deque using linked list 
		Deque<Character> dq = new LinkedList<>();

		System.out.println("enter a string:");
		String str = sc.nextLine();
		for (int i = str.length() - 1; i >= 0; i--) {
			dq.addFirst(str.charAt(i));
		}
        String deq = "";
		for (Character data : dq) 
        {
			deq = deq + data;
		}
		System.out.println(deq);
		String rev = "";
		//reverse the given string and added to empty string
		while (!dq.isEmpty()) {
			rev = rev + dq.removeLast();
		}
		//printing reverse of the string 
		System.out.println(rev);
		//chech whether the string is palindrome or not
		if (deq.equals(rev)) {
			System.out.println("palindrome");
		} else
			System.out.println("not palindrome");
	}
}
