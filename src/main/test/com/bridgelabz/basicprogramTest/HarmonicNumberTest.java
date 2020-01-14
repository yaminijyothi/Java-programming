package com.bridgelabz.basicprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.basicprogramming.HarmonicNumber;

class HarmonicNumberTest {

	@Test
	void test() {
		int n=9;
		float harmonic=HarmonicNumber.harmonic(n);
		assertEquals(harmonic,HarmonicNumber.harmonic(n));
	}

}
