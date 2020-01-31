package com.bridgelabz.DesignPatterns.CreationalDesignPatterns.Singleton;

public class StaticBlock {
public static StaticBlock instance;
private StaticBlock() {}
static {
	try {
	instance=new StaticBlock();
	}catch(Exception e) {
		throw new RuntimeException("Exception occured");
	}
}
public static StaticBlock getInstance() {
	return instance;
}
}

