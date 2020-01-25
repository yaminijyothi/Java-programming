package com.bridgelabz.oops.InventaryManagement.Service;

import com.bridgelabz.oops.InventaryManagement.Implementation.ServiceImplementation;

public class FactoryClass {
	public ServiceImplementation factoryMethod() {
		ServiceImplementation impl=new ServiceImplementation();
		return impl;
	}
}
