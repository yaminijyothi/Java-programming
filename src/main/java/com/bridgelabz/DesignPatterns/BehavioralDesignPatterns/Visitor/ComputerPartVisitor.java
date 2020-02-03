package com.bridgelabz.DesignPatterns.BehavioralDesignPatterns.Visitor;

public interface ComputerPartVisitor {
   public void visit(Computer computer);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
