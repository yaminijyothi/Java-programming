package com.bridgelabz.JunitprogramTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Junitprogramming.Notecount;

class NotecountTest {

	@Test
	void test() {
		int ammount=4500;
		assertEquals(true,Notecount.Currency(ammount));
	}

}
