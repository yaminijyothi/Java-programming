package com.bridgelabz.oops.StockManagement.Service;

import com.bridgelabz.oops.StockManagement.ServiceImplementation.ServiceImplementation;


@SuppressWarnings("unused")
public class FactoryClass {
	public ServiceImplementation factoryMethod() {
		ServiceImplementation impl=new  ServiceImplementation();
		return impl;
	}
}
