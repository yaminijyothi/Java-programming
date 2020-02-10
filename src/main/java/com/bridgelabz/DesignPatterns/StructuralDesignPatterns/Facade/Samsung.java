package com.bridgelabz.DesignPatterns.StructuralDesignPatterns.Facade;

public class Samsung implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("samsomg galaxy");
	}

	@Override
	public void price() {
		System.out.println("15000/-");
	}

}