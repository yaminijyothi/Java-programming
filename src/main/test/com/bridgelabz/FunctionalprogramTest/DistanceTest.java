package com.bridgelabz.FunctionalprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Functionalprogramming.Distance;

class DistanceTest {

	@Test
	void test() {
		int x=3;
		int y=2;
		assertEquals(true,Distance.distance(x, y));
	}

}
