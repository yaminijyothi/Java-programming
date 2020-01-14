package com.bridgelabz.basicprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.basicprogramming.PrimeFactor;

class PrimeFactorTest {

	@Test
	void test() {
		int n=12;
		int n1=PrimeFactor.primefactor(n);
		assertEquals(n1,PrimeFactor.primefactor(n));
		
	}

}
