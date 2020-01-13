/* 
 * @purpose : Demonstrate the monthly  payments by using formula
 * @ file   : Monthlypayment.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Junitprogramming;

public class MonthlyPayment {
       //main method
	public static void main(String[] args) {
	// TODO Auto-generated method stub
      double p=Double.parseDouble(args[0]);
      double  y=Double.parseDouble(args[1]);
      double  r=Double.parseDouble(args[2]);
      payment(p,y,r);
	}
	public static double payment(double p,double y,double r)
	{
      double n=12*y;
      double R=r/(12*100);
      double payment=p*r/(1-Math.pow(1+r,-n));
      System.out.println("payment:"+payment);
      return payment;
      
	}

}
