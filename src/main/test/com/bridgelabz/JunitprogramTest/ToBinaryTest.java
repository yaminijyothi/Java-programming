package com.bridgelabz.JunitprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Junitprogramming.ToBinary;

class ToBinaryTest {

	@Test
	void test() {
		int n=20;
		String str=ToBinary.DecToBin(n);
		assertEquals(str,ToBinary.DecToBin(n));
	}

}
