package com.bridgeit.oops;

import java.util.Random;

import com.bridgeit.utility.Queue;

public class PlayerQueue extends DeckOfCards {

	public static void main(String args[]) {
		DeckOfCards deck = new PlayerQueue();
		
		deck.getCards();
		deck.shuffleCard();

		String playerCards[][] = deck.distribute(4, 9);
		
		int i = 1;
		for (String[] playerCard : playerCards) {

			System.out.println();
			System.out.println("player :" + (i++) + " cards : ");
			for (String card : playerCard) {

				Queue q = new Queue(playerCard.length);
				q.enqueue(card);
			}
			System.out.println();

		}
		

	}

}
