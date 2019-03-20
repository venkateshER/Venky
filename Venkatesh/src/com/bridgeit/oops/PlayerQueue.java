package com.bridgeit.oops;

import java.util.Random;

import com.bridgeit.utility.Queue;
/**
 * 
 * @author Venkatesha E R
 * date:13/03/19
 *
 */
public class PlayerQueue extends DeckOfCards { 			//extending the DeckOfCards class

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
				q.enqueue(card);							//store it into the queue
			}
			System.out.println();

		}
		

	}

}
