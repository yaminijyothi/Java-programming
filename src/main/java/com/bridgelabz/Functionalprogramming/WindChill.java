/* 
 * @purpose : Demonstrate the windchill
 * @ file   : Windchill.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Functionalprogramming;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
        long windchill,windspeed,temp;
        System.out.println("Enter the wind speed: ");
        windspeed =Utility.getLong();
        
        System.out.println("Enter the temperature(fahrenheit):");
        temp=Utility.getLong();	
          if(temp>50)
        	  
          {
        	  System.out.println("the formula is not valid if temperature greater than 50");
        	  return;
          }
          //calculate windchill by using formula
		windchill =(long) (35.74 + 0.6215*temp + (0.4275 * temp-35.75) * Math.pow(windspeed,0.16));
        
          System.out.println("the windchill is: " +windchill);
        
    }
	}

