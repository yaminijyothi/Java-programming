/*purpose :Stack using the Linked List and Print the Anagrams in the Reverse Order.
File    :PrimeAnagramStack.java*/
package com.bridgelabz.DatastructurePrograms.PrimeAnagramStack;


public class PrimeAnagramStack {
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;

		MyStack stack = new MyStack();

		// putting values in array

		for (int j = start; j <= end; j++) {
			if (MyStack.isPrime(j)) {
				for (int k = j + 1; k < end; k++) {
					if (MyStack.isPrime(k)) {
						if (MyStack.isAnagram(String.valueOf(j), String.valueOf(k))) {
							stack.push(j);
							stack.push(k);

						}
					}
				}

			}

		}
		stack.show();
		System.out.println(stack.toString());
	}

}

