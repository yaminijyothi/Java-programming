package com.bridgelabz.FunctionalprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Functionalprogramming.Distance;


class DistanceTest {

	@Test
	void test() {
		int x=1;
		int y=2;
		double distance=Distance.distance(x,y);
		assertEquals(distance,Distance.distance(x,y));
	}

}
