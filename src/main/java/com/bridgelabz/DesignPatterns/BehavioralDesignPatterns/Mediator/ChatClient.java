package com.bridgelabz.DesignPatterns.BehavioralDesignPatterns.Mediator;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator=new ChatMediatorImp();
        User user1=new UserImp(mediator,"yamini");
        User user2=new UserImp(mediator,"shiva");
        User user3=new UserImp(mediator,"sandhya");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        user1.send("hi");
	}

}
