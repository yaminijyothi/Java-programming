package com.bridgelabz.DesignPatterns.CreationalDesignPatterns.Singleton;

public class ThreadSafe {
public static ThreadSafe instance;
private ThreadSafe() {}
public static synchronized ThreadSafe getInstance() {
	if(instance==null) {
		instance=new ThreadSafe();
	}
	return instance;
}
}
