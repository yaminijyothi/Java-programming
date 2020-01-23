package com.bridgelabz.oops.InventaryManagement.Service;

import com.bridgelabz.oops.InventaryManagement.Implementation.ServiceImplementation;
//like mediator between ServiceImlementation and  controller
public class FactoryClass {
	public static ServiceImplementation factoryMethod() {
		ServiceImplementation impl=new ServiceImplementation();
		return impl;
	}
}

