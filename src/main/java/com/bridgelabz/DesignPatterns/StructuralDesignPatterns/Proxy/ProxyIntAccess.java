package com.bridgelabz.DesignPatterns.StructuralDesignPatterns.Proxy;

public class ProxyIntAccess implements OffIntAccess{
	private String employeeName;  
	private RealIntAccess  realaccess;  
	public ProxyIntAccess(String employeeName) {  
		this.employeeName = employeeName;  
	}    
	public int getRole(String emplName) {  
		return 6;  
	}
	@Override
	public void grantIntAccess() {
		if (getRole(employeeName) > 4)   
		{  
			realaccess = new RealIntAccess(employeeName);  
			realaccess.grantIntAccess();  
		}   
		else   
		{  
			System.out.println("No Internet access granted. Your job level is below 5");  
		}
	}  
}