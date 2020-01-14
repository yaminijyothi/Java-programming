package com.bridgelabz.basicprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.basicprogramming.Poweroftwo;

class PoweroftwoTest {

	@Test
	void test() {
		int n=5;
		int x=Poweroftwo.poweroftwo(n);
		assertEquals(x,Poweroftwo.poweroftwo(n));
	}

}
