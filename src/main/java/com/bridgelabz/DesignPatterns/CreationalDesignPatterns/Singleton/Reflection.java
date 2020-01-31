package com.bridgelabz.DesignPatterns.CreationalDesignPatterns.Singleton;

import java.lang.reflect.Constructor;

public class Reflection {
	public static void main(String[] args) {
		EagerInitialization instance1=EagerInitialization.getInstance();
		EagerInitialization instance2=null;
		@SuppressWarnings("rawtypes")
		Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
		{
			try {
				for(Constructor constructor:constructors) {
					constructor.setAccessible(true);
					instance2= (EagerInitialization) constructor.newInstance();
					break;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(instance1.hashCode());
			System.out.println(instance2.hashCode());

		}
	}
}
