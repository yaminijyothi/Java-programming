package com.bridgelabz.JunitprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Junitprogramming.SqrtNewtonMethod;

class SqrtNewtonMethodTest {

	@Test
	void test() {
		double c=5;
	    double e= 1e-15;
	    double t=c;
	   assertEquals(true,SqrtNewtonMethod.newtonmethod(c,e,t));

}
}
