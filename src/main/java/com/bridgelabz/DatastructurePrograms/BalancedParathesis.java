/* purpose :Balancing the parathasis of given equation using stack.
 * File    :BalancedParanthesis.java
 */
package com.bridgelabz.DatastructurePrograms;

import java.util.Stack;

public class BalancedParathesis {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="(6+1)/(3-1)*(1+2" ;
		String result=isBalanced(exp)?"balanced":"notbalanced";
	    System.out.println("Given equation is "+result);
		
	}
	//logic for checking if it is balanced or not
	public static boolean isBalanced(String exp)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<exp.length();i++)
		{
			char c=exp.charAt(i);
		
			if(c=='(')
			{
				stack.push(exp.charAt(i));
			}
			else if(c==')')
			{
				stack.pop();
			}
		}
		return stack.empty();
	}
}