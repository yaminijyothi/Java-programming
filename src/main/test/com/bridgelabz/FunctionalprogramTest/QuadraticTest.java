package com.bridgelabz.FunctionalprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Functionalprogramming.Quadratic;

class QuadraticTest {

	@Test
	void test() {
		float a=1;
		float b=2;
		float c=3;
		assertEquals(true,Quadratic.quadratic(a, b, c));
	}

}
