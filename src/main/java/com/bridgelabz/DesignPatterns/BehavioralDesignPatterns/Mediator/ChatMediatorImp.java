package com.bridgelabz.DesignPatterns.BehavioralDesignPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImp  implements ChatMediator {
	private List<User> users;
	public ChatMediatorImp() {
		this.users=new ArrayList<>();
	}
	@Override
	public void Sendmessage(String msg, User user) {
		for(User u:users) {
			if(u!=user) {
				u.recieve(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}

