package com.bridgeit.datastructure;

import java.util.Scanner;

import com.bridgeit.utility1.Utility;

/**
 * 
 * @author Venkatesha E R date:11/03/19
 *
 */
public class BinaryTree {

	static long fact1 = 1;
	static long fact2 = 1;
	static long fact3 = 1;

	public static long factorial(long n) {

		for (int i = 1; i <= n; i++) {
			fact1 = i * fact1;
		}
		// System.out.println(fact1);
		return fact1;
	}

	public static long factorial1(long n) {
		long n2 = 2 * n;
		for (int i = 1; i <= n2; i++) {
			fact2 = i * fact2;
		}
		return fact2;
	}

	public static long factoria12(long n) {
		long n1 = n + 1;
		for (int i = 1; i <= n1; i++) {
			fact3 = i * fact3;
		}
		return fact3;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		long tree = ((factorial1(n)) / (factoria12(n) * factorial(n)));
		System.out.println(tree + ":number of nodes in tree for =>" + n);

	}

}
