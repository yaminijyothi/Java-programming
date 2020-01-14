package com.bridgelabz.basicprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.basicprogramming.LeapYear;

class LeapYearTest {

	@Test
	void test() {
		int n=2020;
		int  str=LeapYear.leap(n);
		assertEquals(str,LeapYear.leap(n));
	}

}
