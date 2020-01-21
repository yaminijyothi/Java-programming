/*purpose : cashcounte using queue.
File    :CashCounter.java*/
package com.bridgelabz.DatastructurePrograms.CashCounter;
import java.util.Scanner;
public class CashCounter {
	 static int balance=5000;
	 static	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue que=new MyQueue();
		que.enQueue(balance);
		System.out.println("Select the  option");

		do {
			System.out.println(" 1.Deposit.");
			System.out.println(" 2.Withdrawl.");
			System.out.println(" 3.exit.");
			int c=sc.nextInt();
			//switch case to perform selected option
			switch(c) {
			case 1:int bal=deposite();
			que.deQueue();
			que.enQueue(bal);
			que.show();
			break;
			case 2:int bal2=withdrawl();
			que.deQueue();
			que.enQueue(bal2);
			que.show();
			break;
			case 3:
				System.exit(0);
			default: System.out.println("enter valid option");
			}
		}while(balance>0);
	}
	//to deposit money
	public static int deposite() {
		System.out.println("enter the amount to be deposited");
		int amount=sc.nextInt();
		if(amount%100==0) {
			balance+=amount;
			System.out.println("Balance:"+balance);
		}
		else {
			System.out.println("amount should be multiples of 100.");
		}
		return balance;
	}
	// to withdrawl money
	public static int withdrawl() {
		System.out.println("enter the amount to be withdrawl");
		int amount2=sc.nextInt();
		if(balance>amount2) {
			balance-=amount2;
			System.out.println("Balance:"+balance);
		}else {
			System.out.println("amount is less than balance.");
		}
		return balance;
	}
}