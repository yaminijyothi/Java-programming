package com.bridgelabz.DesignPatterns.StructuralDesignPatterns.Proxy;

public class ProxyPattern {
	 public static void main(String[] args)   
	    {  
	        OffIntAccess access = new ProxyIntAccess("yaminijyothi");  
	        access.grantIntAccess();  
	    }  
	}  

