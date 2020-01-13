package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.Utility;
// User Input and Replace String Template �Hello <<UserName>>, How are you?�.

public class Username {
    static String userName="";
    static String data="Hello userName, How are you?";
    public static void main(String[] args)
    {
        System.out.println("enter user name:");
        userName=Utility.getString();
        if(true);
        {
            stringReplacer(userName);
        }
        
    }
    public static boolean length(String userName)
    {
        //giving condition that userName should be grater than 3.
        if(userName.length()<3)
        {
            System.out.println("userName length should be greater than 3");
            return false;
        }
        else
        {
            return true;
        }
    }
    //replacing string.
    public static String stringReplacer(String userName)
    {    
        System.out.println(data.replaceAll("userName", userName));
        return userName;
    }
}


