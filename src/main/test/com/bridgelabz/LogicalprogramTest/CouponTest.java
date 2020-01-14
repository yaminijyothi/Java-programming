package com.bridgelabz.LogicalprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Logicalprogramming.Coupon;

class CouponTest {

	@Test
	void test() {
		int n=5;
		int arr[]=new int [n];
		int str=Coupon.coupon(n,arr);
		assertEquals(str,Coupon.coupon(n,arr));
	}

}
