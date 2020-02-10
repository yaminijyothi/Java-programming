package com.bridgelabz.DesignPatterns.StructuralDesignPatterns.Facade;

public class Iphone implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("iphone 6");
	}

	@Override
	public void price() {
		System.out.println("100000/-");
	}

}
