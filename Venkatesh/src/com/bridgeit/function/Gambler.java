package com.bridgeit.function;

import java.util.Random;
import java.util.Scanner;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 *	date:22/02/19
 */
public class Gambler {

	public static void main(String[] args) {
		
		
			int bets, wins;
			System.out.println("Enter initial stake...!");
			int stake = Utility.getPositiveInt();

			System.out.println("Enter your goal...!");
			int goal = Utility.getPositiveInt();

			System.out.println("Enter No. of times you want to play...!");
			int trials = Utility.getPositiveInt();

			int result[] = Utility.playGame(stake, goal, trials);
			bets = result[0];
			wins = result[1];
			System.out.println("Total no. of bets made  = " + bets);
			System.out.println("Total no. of wins = " + wins);
			double winPercentage = (wins * 100.0) / trials;
			System.out.println("Win % = " + winPercentage);	
			System.out.println("Loss % = " + (100 - winPercentage));
		}
}
