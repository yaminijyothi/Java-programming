
/*purpose : printing cards to player in two dimensional array
File    : DeckOfCardInTwoDim.java*/
package com.bridgelabz.oops.DeckofCards.DeckofCardsInTwoDim;

import java.util.Random;


public class DeckOfCardInTwoDim {
//declaring two dimensional array
	static int[][] cards=new int[4][13];
	//main method starts
	public static void main(String[] args)
	{
		
		//cards player
		for(int playNumber=1;playNumber<=4;playNumber++)
		{
			DeckOfCardInTwoDim.Card(playNumber);
			System.out.println("Player "  + playNumber + "'s cards:");
			//prints cards of respective player
			DeckOfCardInTwoDim.print(playNumber);
		}
	}
	public static void Card(int playNumber)
	{

		for (int i = 0; i < 9; i++) {
			allotCard(playNumber);
		}
	}

	public static void allotCard(int playNumber) {
		Random random = new Random();

		int suit = random.nextInt(4);
		int rank = random.nextInt(13);

		if (cards[suit][rank] != 0) {
			allotCard(playNumber);
		} else {
			cards[suit][rank] = playNumber;
		}
	}
	// Prints cards in ascending order 
	public static void print(int playNumber) {
		for(int suit = 0; suit < 4; suit++) {
			for(int rank = 0; rank < 13; rank++) {
				if(cards[suit][rank] == playNumber) {
					System.out.print(getSuit(suit) + " " + getRank(rank) + "\t");
				}
			}
		}
		System.out.println("\n");
	}

	// returns rank of the card from number 
	public static String getRank(int rankNumber) {
		switch(rankNumber) {
		case 0:
			return "2";
		case 1:
			return "3";
		case 2:
			return "4";
		case 3:
			return "5";
		case 4:
			return "6";
		case 5:
			return "7";
		case 6:
			return "8";
		case 7:
			return "9";
		case 8:
			return "10";
		case 9:
			return "Jack";
		case 10:
			return "Queen";
		case 11:
			return "King";
		case 12:
			return "Ace";
		default:
			return "";
		}
	}

	// returns suit name from number 
	public static String getSuit(int suitNumber) {
		switch(suitNumber) {
		case 0:
			return "Clubs";
		case 1:
			return "Diamonds";
		case 2:
			return "Hearts";
		case 3:
			return "Spades";
		default:
			return "";
		}
	}


}
