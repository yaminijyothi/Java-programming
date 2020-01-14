package com.bridgelabz.JunitprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Junitprogramming.TemperatureConverstion;

class TemperatureConverstionTest {

	@Test
	void test() {
		double F=40;
		double c=TemperatureConverstion.celsius(F);
		assertEquals(c,TemperatureConverstion.celsius(F));
		
	}

}
