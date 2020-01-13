package com.bridgelabz.AlgorithmprogramTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Algorithmprograms.BubbleSort;

class BubbleSortTest {

	@Test
	void test() {
		int a[]= {4,1,2};
		int n=a.length;
		int rev[]= {1,2,4};
		String ss=Arrays.toString(rev);
		assertEquals(ss,BubbleSort.sort(n,a));
		
	}
		

}
