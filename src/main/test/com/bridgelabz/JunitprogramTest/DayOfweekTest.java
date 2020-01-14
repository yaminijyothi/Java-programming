/* 
* @purpose : Testing for DayOfweek
* @ file   : DayofWeekTest.java
* @ author : yaminijyothi
*/
package com.bridgelabz.JunitprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Junitprogramming.DayOfWeek;

class DayOfweekTest {

	@Test
	void test() {
		int m=8;
		int d=3;
		int y=1998;
		int d1=DayOfWeek.week(m,d,y);
		assertEquals(d1,DayOfWeek.week(m,d,y));
	}

	

}
