/* 
* @purpose : Demonstrate the gambler game
* @ file   : Gambler.java
* @ author : yaminijyothi
*/
package com.bridgelabz.Logicalprogramming;

import com.bridgelabz.utility.Utility;

public class Gambler {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
		System.out.println("enter $stack:");
		int stack=Utility.getint();
		System.out.println("enter goals:");
		int goal=Utility.getint();
		System.out.println("enter number of trails :");
		int trail=Utility.getint();
		gambler(stack,goal,trail);
		
		}
		public static void gambler(int stack,int goal,int trail)
		{
			int wins=0;
			int bets=0;
			
			for(int i=0;i<trail;i++) {
				int flags=stack;
				while(flags>0&&flags<goal)
				{
					bets++;
					int random=Math.random()<0.5?flags++:flags--;
				}
				if(flags==goal)
					wins++;
			}
			System.out.println(wins+" wins of "+trail);
			System.out.println("% of games won:"+100*wins/trail);
		    System.out.println("% of game loose:"+100*(trail-wins)/trail);
		    }

		
}