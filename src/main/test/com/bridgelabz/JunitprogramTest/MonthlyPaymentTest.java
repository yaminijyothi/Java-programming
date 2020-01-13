package com.bridgelabz.JunitprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Junitprogramming.MonthlyPayment;

class MonthlyPaymentTest {

	@Test
	void test() {
		double p=5.6;                                                  ;
		double  y=5.43;
		double  r=4.21;	
		double rst = MonthlyPayment.payment(p,y,r);
		assertEquals(rst,MonthlyPayment.payment(p,y,r));
	}

}
