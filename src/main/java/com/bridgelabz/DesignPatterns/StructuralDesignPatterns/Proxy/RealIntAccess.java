package com.bridgelabz.DesignPatterns.StructuralDesignPatterns.Proxy;

public class RealIntAccess implements OffIntAccess {

	 private String employeeName;  
	    public RealIntAccess(String empName) {  
	        this.employeeName = empName;  
	    }  
	    @Override  
	    public void grantIntAccess() {  
	        System.out.println("Internet Access granted for employee: "+ employeeName);  
	    }  
}
