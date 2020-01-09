/* 
 * @purpose : Demonstrate the sqareroot by using newtons method
 * @ file   : SqrtNewtonMethod.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Junitprogramming;

public class SqrtNewtonMethod {
	public static void main(String[] args)
	{
//passing argument in arguments in run as configuration
	double c=Double.parseDouble(args[0]);
    double e= 1e-15;
    double t=c;
    while(Math.abs(t-c/t)>e*t)
    {
  	  t=(c/t+t)/2.0;
    }
    System.out.println(t);
	}
}

