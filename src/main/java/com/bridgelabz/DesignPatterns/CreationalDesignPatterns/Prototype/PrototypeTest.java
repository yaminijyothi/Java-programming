//purpose : implemmenting prototypedesign pattern.
//File : PrototypeTest.java
package com.bridgelabz.DesignPatterns.CreationalDesignPatterns.Prototype;

import java.util.List;

public class PrototypeTest {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Employee emp= new Employee();
 emp.loadData();
 Employee emp1=(Employee) emp.clone();
 Employee emp2=(Employee) emp.clone();
 List<String> list1=emp1.getEmplist();
 list1.remove("unknown");
 List<String> list2=emp2.getEmplist();
 list2.add("divya");
 System.out.println(emp.getEmplist());
 System.out.println(list1);
 System.out.println(list2);
	}

}
