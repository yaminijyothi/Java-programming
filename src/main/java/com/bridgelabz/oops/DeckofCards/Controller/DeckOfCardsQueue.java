package com.bridgelabz.oops.DeckofCards.Controller;
import java.util.Random;

import com.bridgelabz.oops.DeckofCards.Model.Card;
import com.bridgelabz.oops.DeckofCards.Utility.Queue;
public class DeckOfCardsQueue {
	//queue for players.
	static Queue<Player> playerQueue;
	//array for cards.
	static int[][] cardsArray;
	public static void main(String[] args)
	{
		DeckOfCardsQueue.start();
		DeckOfCardsQueue.dequeuePlayer();
	}
	//intilize queue and add players.
	public static void start() {
		playerQueue=new Queue<Player>();
		cardsArray=new int[4][13];
		for(int i=0;i<4;i++)
		{
			
			addPlayer();
		}
	}
	//creates a player and allot cards.
	public static void addPlayer() {
		Player player=new Player();
		for(int i=0;i<9;i++)
		{
			allotCard(player);
		}
		player.enqueueCards();
		playerQueue.enqueue(player);
	}
	//Generate a random card and allot it to a player.
	public static void allotCard(Player player) {
		Random random=new Random();
		int suit= random.nextInt(4);
		int rank = random.nextInt(13);
		//check if cards are allocated are not
		if(cardsArray[suit][rank]==0)
		{
			//adds card to player.
			player.addCard(suit,rank);
			//marks card as alloted.
			cardsArray[suit][rank]=1;
		}
		else
		{
			//card is already alloted generate a new card
			allotCard(player);
		}
	}
	//dequeue players
	public static void dequeuePlayer()
	{
		for(int i=0;i<4;i++)
		{
			Player player=playerQueue.dequeue();
			System.out.println("player"+(i+1)+"cards");
			printPlayerCards( player);
			{
				System.out.println();
			}
		}
	}
	//print player cards.
	public static void printPlayerCards(Player player)
	{
		for(int i=0;i<9;i++)
		{
			Card card=player.getCard();
			System.out.print(card.getSuit(i)+""+card.getRank(i)+"\t");
		}

	}
}
