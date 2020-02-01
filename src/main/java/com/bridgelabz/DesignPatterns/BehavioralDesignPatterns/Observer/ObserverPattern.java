package com.bridgelabz.DesignPatterns.BehavioralDesignPatterns.Observer;

public class ObserverPattern {
	public static void main(String[] args) {
	      Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
}
}
