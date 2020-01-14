package com.bridgelabz.FunctionalprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Functionalprogramming.SumofThree;

class SumofThreeTest {

	@Test
	void test() {
		int  n=5;
		int arr[]= {1,-2,-1,-2,3};
		int count=SumofThree.sumofthree(n,arr);
		assertEquals(count,SumofThree.sumofthree(n,arr));
	}
}
