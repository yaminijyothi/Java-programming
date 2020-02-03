package com.bridgelabz.DesignPatterns.BehavioralDesignPatterns.Visitor;

public class Keyboard implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		 computerPartVisitor.visit(this);
	}

}
