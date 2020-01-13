package com.bridgelabz.FunctionalprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Functionalprogramming.TwoDimArray;

class TwoDimArrayTest {

	@Test
	void test() {
		int m=2;
		int n=2;
		int arr[]= {1,2,3,4};
		String  str[]= {"true","false","false","true"};
		double  b[]= {2.3,4.2,5.4,2.1};
		assertEquals(true,TwoDimArray.arrint(m,n));
		assertEquals(true,TwoDimArray.arrayBoolean(m,n));
		assertEquals(true,TwoDimArray.arraydouble(m,n));
		
		
	}

}
