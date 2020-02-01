package com.bridgelabz.DesignPatterns.BehavioralDesignPatterns.Mediator;

public class UserImp extends User{

	public UserImp(ChatMediator mediator, String name) {
		super(mediator, name);
		
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name+"  Sending messgage  "+msg);
		mediator.Sendmessage(msg, this);
	}

	@Override
	public void recieve(String msg) {
		System.out.println(this.name+" recieved message "+msg);
		
	}

}
