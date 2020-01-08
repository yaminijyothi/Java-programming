/* 
* @purpose : Demonstrate given strings are anagram or not
* @ file   : Annagram.java
* @ author : yaminijyothi
*/
package com.bridgelabz.Algorithmprograms;
import java.util.Arrays;
import com.bridgelabz.utility.Utility;

public class Anagram {
	public static void isAnagram(String str1,String str2) {
		String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status =true;
        if(s1.length()!=s2.length())
        {
        	status=false;
        }
        else
        {
        	char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }
        if(status)
        {
        	System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
        	System.out.println(s1+" and "+s2+" are not anagrams");
        }
        }
       //main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string1:");
		String str1=Utility.getString();
		System.out.println("enter string2:");
		String str2=Utility.getString();
		//calling anagram function
		isAnagram(str1,str2);
	}
}
		