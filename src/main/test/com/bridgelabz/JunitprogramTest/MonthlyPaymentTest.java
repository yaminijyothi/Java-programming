/* 
* @purpose : Testing for monthlyPayment
* @ file   : MonthlypaymentTest.java
* @ author : yaminijyothi
*/
package com.bridgelabz.JunitprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Junitprogramming.MonthlyPayment;

class MonthlyPaymentTest {

	@Test
	void test() {
		double p=2;                                                  ;
		double  y=3;
		double  r=4;	
		double rst = MonthlyPayment.payment(p,y,r);
		assertEquals(rst,MonthlyPayment.payment(p,y,r));
	}

}
