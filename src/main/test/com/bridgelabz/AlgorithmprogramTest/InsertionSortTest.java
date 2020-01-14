package com.bridgelabz.AlgorithmprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Algorithmprograms.InsertionSort;

class InsertionSortTest {

	@Test
	void test() {
		String arr[] = { "python", "java", "dotnet", "springs", "script" };
		String sortedArray[] = InsertionSort.sortsub(arr, arr.length);
		assertEquals(sortedArray,InsertionSort.sortsub(arr, arr.length));
	}

}
