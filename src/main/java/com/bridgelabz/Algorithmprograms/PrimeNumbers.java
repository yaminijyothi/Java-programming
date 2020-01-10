/* 
 * @purpose : finding the primenumbers from 1 to 1000
 * @ file   : PrimeNumbers.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Algorithmprograms;

public class PrimeNumbers {
    //main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The primenumbers are are:");
		int i, n;
		for (n = 1; n <= 1000; n++) {
			int count = 0;
			//logic for prime number
			for (i = 1; i <= n; i++) {
				if (n % i == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
          //print prime number
				System.out.println(n);

			}
		}
	}
}

	