package com.bridgeit.algorithm;

import com.bridgeit.utility1.Utility;

/**
 * 
 * @author  Venkatesha E R
 * date:28/02/19
 *
 */
public final class Guess {
	
	public static void main(String[] args) {
		
		int num = 0;
		if (args.length < 1) {
			System.out.println("Provide command line argument...!");
			return;
		}
		num = Integer.parseInt(args[0]);		//inputs from command line arguments

		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = i;
		}
		System.out.println("Think a number in the range : 0 to " + (num - 1));
		char choice;
		do {
			System.out.println("Have you assumed a number...?");
			System.out.println("Enter your answer as 'y/n'");
			choice = Utility.sc.next().toLowerCase().charAt(0);
		} while (choice != 'y');

		Utility.guess(arr, 0, num - 1);

	}

}
