package com.bridgelabz.AlgorithmprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Algorithmprograms.PrimeNumbers;

class PrimeNumbersTest {

	@Test
	void test() {
	     int n=121;
	     assertEquals(true,PrimeNumbers.primeNumber());
	}

}