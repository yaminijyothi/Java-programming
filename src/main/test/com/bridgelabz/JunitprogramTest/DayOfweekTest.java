package com.bridgelabz.JunitprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Junitprogramming.DayOfWeek;

class DayOfweekTest {

	@Test
	void test() {
		int m=8;
		int d=3;
		int y=1998;
		assertEquals(true,DayOfWeek.dayofweek(m,d,y));
	}

	

}
