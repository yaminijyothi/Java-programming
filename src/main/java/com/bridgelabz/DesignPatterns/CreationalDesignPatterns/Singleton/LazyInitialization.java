package com.bridgelabz.DesignPatterns.CreationalDesignPatterns.Singleton;

public class LazyInitialization {
public static LazyInitialization instance;
private LazyInitialization() {}
public static LazyInitialization getInstance() {
	if(instance==null) {
		instance=new LazyInitialization();
	}
	return instance;
}
}
