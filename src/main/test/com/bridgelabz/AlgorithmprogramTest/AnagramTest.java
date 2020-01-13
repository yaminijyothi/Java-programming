package com.bridgelabz.AlgorithmprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Algorithmprograms.Anagram;

class AnagramTest {

	@Test
	void test() {
		String str1="creator";
	    String str2="reactor";
	    assertEquals(true,Anagram.isAnagram(str1, str2));
	}

}


