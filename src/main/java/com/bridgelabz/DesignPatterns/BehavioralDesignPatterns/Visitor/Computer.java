package com.bridgelabz.DesignPatterns.BehavioralDesignPatterns.Visitor;

public class Computer implements ComputerPart{
	ComputerPart[] parts;

	   public Computer(){
	      parts = new ComputerPart[] {new Keyboard(), new Monitor()};		
	   } 
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		for (int i = 0; i < parts.length; i++) {
	         parts[i].accept(computerPartVisitor);
	      }
	      computerPartVisitor.visit(this);
	   }
	}


