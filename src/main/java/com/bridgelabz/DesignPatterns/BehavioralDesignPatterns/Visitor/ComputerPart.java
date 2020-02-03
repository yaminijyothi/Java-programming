package com.bridgelabz.DesignPatterns.BehavioralDesignPatterns.Visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
