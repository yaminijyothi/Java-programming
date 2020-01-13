/* 
 * @purpose : Demonstrate the permutations of a String
 * @ file   : Permutations.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Algorithmprograms;

import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class Permutations {
static ArrayList<String> result=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("given a String:");
		String str=Utility.getString();
		getPermutation("",str);
		//printing String permutations
		System.out.println(Arrays.toString(result.toArray()));
	}
	   // method for permutations for string 
	static ArrayList<String> getPermutation(String fix,String unfix)
	{
		if(unfix.length()==0)
		{
			result.add(fix);
			return result;
		}
		for(int i=0;i<unfix.length();i++)
		{
			String f=fix+unfix.charAt(i);
			String unfixed=unfix.substring(0,i)+unfix.substring(i+1);
			//calling by using recursion function
			getPermutation(f,unfixed);
		}
		return result;
	}
}
