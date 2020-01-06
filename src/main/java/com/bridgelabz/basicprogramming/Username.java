package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.Utility;

public class Username {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String data="Hi username how are you";
     String[] space=data.split(" ");
     String username="";
     for(int i=0;i<space.length;i++)
     {
    	 if(space[i].equalsIgnoreCase("username")) {
    	 
    		 System.out.println("enter user name:");
              space[i]=Utility.getString();
     }
     username+=space[i]+" ";
	}
    
	System.out.println(username);
	}
}

	
