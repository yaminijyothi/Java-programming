/* 
 * @purpose : Demonstrate the primenumbers which are palindromes
 * @ file   : PrimePalindrom.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Algorithmprograms;

public class PrimePalindromNumber {

	 boolean flag;
       //main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The primenumbers are are:");
		for (int n = 0; n <= 1000; n++) {
			int rev = 0, num = n;
		// logic for palindrome numbers
			while (num != 0) {
				int r = num % 10;
				rev = rev * 10 + r;
				num = num / 10;
			}
			if (n == rev) {
				boolean flag = false;
		// logic for primenumbers
				for (int j = 2; j <= n / 2; j++) {

					if (n % j == 0) {

						flag = true;
						break;
					}
				}
				if (!flag) {
					System.out.println(n);
				}
			}
		}
	}
}
