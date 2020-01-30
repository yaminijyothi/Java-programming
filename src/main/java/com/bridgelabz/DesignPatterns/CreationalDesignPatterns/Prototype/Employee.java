package com.bridgelabz.DesignPatterns.CreationalDesignPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
 private List<String> emplist;
 Employee() {
	 emplist=new ArrayList<String>();
 }
 private Employee(List<String> list) {
	 this.emplist=list;
 }
	
 public void loadData() {
	 emplist.add("shiva");
	 emplist.add("sai");
	 emplist.add("shake");
	 emplist.add("yamini");
	 emplist.add("sandhya");
	 emplist.add("unknown");
 }
 public List<String> getEmplist(){
	 return emplist;
 }
 public Object clone() {
	 List<String> temp=new ArrayList<String>();
	 for(String s:this.getEmplist()) {
		 temp.add(s);
	 }
	return new Employee(temp);
 }
}

