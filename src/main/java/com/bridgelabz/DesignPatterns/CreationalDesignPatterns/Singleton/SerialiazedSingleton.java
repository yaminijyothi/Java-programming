package com.bridgelabz.DesignPatterns.CreationalDesignPatterns.Singleton;

import java.io.Serializable;

public class SerialiazedSingleton implements Serializable{

private SerialiazedSingleton() {}
private static class helper{
private static final SerialiazedSingleton instance=new SerialiazedSingleton();
}
public static SerialiazedSingleton getInstance() {
	return helper.instance;
}
}
