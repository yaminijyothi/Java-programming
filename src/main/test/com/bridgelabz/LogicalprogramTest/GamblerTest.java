package com.bridgelabz.LogicalprogramTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.Logicalprogramming.Gambler;

class GamblerTest {

	@Test
	void test() {
		int stack=5;
		int goal=10;
		int trail=5;
		int gambler=Gambler.gambler(stack,goal,trail);
		assertEquals(gambler,Gambler.gambler(stack,goal,trail));
				
	}

}
