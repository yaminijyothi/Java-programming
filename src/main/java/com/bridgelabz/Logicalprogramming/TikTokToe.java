/* 
 * @purpose : Demonstrate the Tic-Tac-Toe game
 * @ file   : TikTokToe.java
 * @ author : yaminijyothi
 */
package com.bridgelabz.Logicalprogramming;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

class Controll{
	public int winner(char [] a, char s) {
		if(((a[0]==a[1])&& (a[1]==a[2])&& (a[2]==s)) || (a[3]==a[4])&& (a[4]==a[5])&& (a[5]==s) || (a[6]==a[7])&& (a[7]==a[8])&& (a[8]==s) 
				|| (a[0]==a[3])&& (a[3]==a[6])&& (a[6]==s) || (a[1]==a[4])&& (a[4]==a[7])&& (a[7]==s) || (a[2]==a[5])&& (a[5]==a[8])&& (a[8]==s) ||
				(a[0]==a[4])&& (a[4]==a[8])&& (a[8]==s)|| (a[2]==a[4])&& (a[4]==a[6])&& (a[6]==s)) {
			return 1;
		}
		else return 0;
	}
	//printing board
	public void printBoard(char [] a) {
		System.out.println("/---|---|---\\");
		System.out.println("| " + a[0] + " | " + a[1] + " | " + a[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + a[3] + " | " + a[4] + " | " + a[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + a[6] + " | " + a[7] + " | " + a[8] + " |");
		System.out.println("/---|---|---\\");
	}
}

class PlayControll{
	char []a= {'-','-','-','-','-','-','-','-','-'};
	int count=0;
	int i=0;
	//playing user1
	public void playUser1() {
		Controll c= new Controll();
		System.out.println("user 1 here");
		int in=0;
		if(count<9) {
			in=Utility.getint();
			if(in<9) {
				if(a[in]=='-') {
					a[in]='X';
					c.printBoard(a);
					count++;
					i=c.winner(a,'X');
					if(i==1) {
						System.out.println("player 1 is winner");
						c.printBoard(a);
					}else
						playUser2();
				}
				else {
					System.out.println("Already Filled try Anothor");
					playUser1();
				}
			}
			else {
				System.out.println("places available below 9");
				playUser1();
			}

		}
		else {
			System.out.println("No one Wins try next time");
			c.printBoard(a);
		}
	}
	//playing user2
	public void playUser2() {
		Controll c= new Controll();
		System.out.println("user 2 here");
		int in=0;
		if(count<9) {
			in=Utility.getint();
			if(in<9) {
				if(a[in]=='-') {
					a[in]='O';
					c.printBoard(a);
					count++;
					i=c.winner(a,'O');
					if(i==1) {
						System.out.println("player 2 is winner");
						c.printBoard(a);
					}else
						playUser1();
				}
				else {
					playUser2();
				}
			}
			else {
				System.out.println("That field already filled try anethor");
				playUser2();
			}

		}
		else {
			System.out.println("No one Wins try next time");
			c.printBoard(a);
		}
	}
	public void display() {
		for(int i=0;i<9;i++) {
			System.out.println(a[i]);
		}

	}
}
//main class
public class TikTokToe {
//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PlayControll pc=new PlayControll();

		if(Math.random()>0.5) {
			pc.playUser1();
		}
		else {
			pc.playUser2();
		}

	}

}