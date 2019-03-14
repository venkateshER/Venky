package com.bridgeit.datastructure;

import java.util.Scanner;

import com.bridgeit.utility.Dequeue;
import com.bridgeit.utility1.Utility;

/**
 * 
 * @author Venkatesha E R date:07/03/19
 *
 */
public class PolindromeCheck {

	public static Dequeue queue = new Dequeue();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check palindrome are not");
		String input = sc.nextLine();

		char[] charA = input.toCharArray();

		for (int i = 0; i < charA.length; i++) {
			queue.addRear(Character.toString(charA[i]));
		}
		String reverse = "";

		int length = queue.size();
		for (int i = 0; i < length; i++) {
			reverse = reverse + queue.removeRear();
		}

		if (input.compareTo(reverse) == 0) {
			System.out.println("the string is palindrome");
		} else {
			System.out.println("the string is not a palindrome");
		}
	}

}
