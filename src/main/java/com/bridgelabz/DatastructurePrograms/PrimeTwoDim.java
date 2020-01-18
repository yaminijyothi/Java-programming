/*purpose : printing primenumbers in twidimensional array.
File    : PrimeTwoDim.java*/
package com.bridgelabz.DatastructurePrograms;

public class PrimeTwoDim {
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
	public static void main(String[] args) {
		int start = 0;
		int end = 100;

		int[][] pm = new int[10][];

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (isPrime(j)) {
					j1++;
				}
			}
			pm[i] = new int[j1];
			start = end + 1;
			end += 100;
			j1 = 0;

		}
		start = 0;
		end = 100;
		// putting values in array
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {

				if (isPrime(j)) {
					pm[i][j2] = j;
					j2++;
				}

			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
		for (int i = 0; i < pm.length; i++) {
			for (int j = 0; j < pm[i].length; j++)
				System.out.print(pm[i][j] + " ");
			System.out.println();
		}

	}

}

