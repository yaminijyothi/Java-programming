package com.bridgelabz.JunitprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Junitprogramming.TemperatureConverstion;

class TemperatureConverstionTest {

	@Test
	void test() {
		double f=30;
		assertEquals(true,TemperatureConverstion.celsius(f));
		
	}

}
