package com.bridgelabz.oops.DeckofCards.Model;

public class Card {
	String suit;
	String rank;
	public Card(int suit,int rank)
	{
		this.suit=getSuit(suit);
		this.rank=getRank(rank);
	}

	public String getSuit()
	{
		return suit;
	}

	public String getRank()
	{

		return rank;
	}
	//return suit name from number.
	public String getSuit(int suitNumber) {
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
	//return rank of the card from number.
	public String getRank(int rankNumber) {
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
}
