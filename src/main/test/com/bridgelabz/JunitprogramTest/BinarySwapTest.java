/* 
* @purpose : Testing for BinarySwap
* @ file   : BinarySwapTest.java
* @ author : yaminijyothi
*/
package com.bridgelabz.JunitprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Junitprogramming.BinarySwap;

class BinarySwapTest {

	@Test
	void test() {
		int n=100;
		assertEquals(true,BinarySwap.swap(n));
	}

}
