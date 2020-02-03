package com.bridgelabz.DesignPatterns.BehavioralDesignPatterns.Visitor;

public class Monitor implements ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);

}}
