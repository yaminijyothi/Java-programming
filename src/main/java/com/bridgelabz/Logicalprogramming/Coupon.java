/* 
 * @purpose : Demonstrate the coupon numbers
 * @ file   : Coupon.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Logicalprogramming;

import com.bridgelabz.utility.Utility;
import java.util.Random;

public class Coupon {
//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of coupons requied:");
		int n = Utility.getint();
		int arr[] = new int[10];
		Random rand = new Random();
		//logic for non repeated coupon numbers
		for (int i = 0; i < n; i++) {
			int coupon = rand.nextInt(1000);
			if (coupon != arr[i])

			{
				System.out.println(coupon + "");

			}

		}
	}

}
