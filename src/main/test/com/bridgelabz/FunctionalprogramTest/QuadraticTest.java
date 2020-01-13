package com.bridgelabz.FunctionalprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Functionalprogramming.Quadratic;

class QuadraticTest {

	@Test
	void test() {
		float a=2;
		float b=3;
		float c=4;
		assertEquals(true,Quadratic.quadratic(a, b, c));
	}

}
