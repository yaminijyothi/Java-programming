/* 
 * @purpose : regular expression of a string
 * @ file   : Regex.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Algorithmprograms;
import java.util.regex.Matcher;

public class Regex {

	public static void main(String[] args) {

		//given data replace with  user details
		String a=" Read in the following message: Hello --name--, We have your full name as --full name-- in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		a=a.replaceAll("--name--",  Matcher.quoteReplacement("yamini"));
		a=a.replaceAll("--full name--",  Matcher.quoteReplacement("G.Yamini jyothi"));
		a=a.replaceAll("91-xxxxxxxxxx",  Matcher.quoteReplacement("1234567890"));
		a=a.replaceAll("01/01/2016.",  Matcher.quoteReplacement("01/01/2020"));
		System.out.println(a);
	}

}



