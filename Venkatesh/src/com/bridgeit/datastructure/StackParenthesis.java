package com.bridgeit.datastructure;

import java.util.Scanner;

/**
 * 
 * @author Venkatesha E R date:05/03/19
 *
 */
public class StackParenthesis {
	static int top = -1;
	static char[] arr = new char[100];

	StackParenthesis() {
		top = -1;
	}

	static boolean isEmpty() {
		return (top < 0);
	}

	static boolean push(char c) {
		if (top >= 99) {
			System.out.println("Stack overflow");
			return false;
		}
		arr[++top] = c;
		return true;
	}

	static char pop() {
		if (top < -1) {
			System.out.println("Stack underflow");
			return '\0';
		}
		char x = arr[top--];
		return x;
	}

	static boolean matchPair(char c1, char c2) {
		if (c1 == '(' && c2 == ')')
			return true;
		else if (c1 == '[' && c2 == ']')
			return true;
		else if (c1 == '{' && c2 == '}')
			return true;
		else
			return false;
	}

	static boolean balancedParenthesis(char exp[]) {
		StackParenthesis st = new StackParenthesis();

		for (int i = 0; i < exp.length; i++) {
			if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
				st.push(exp[i]);

			if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
				if (st.isEmpty()) {
					return false;
				}

				else if (!matchPair(st.pop(), exp[i])) {
					return false;
				}
			}

		}

		if (st.isEmpty())
			return true;
		else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the expresssion");
		char[] exp = sc.next().toCharArray();

		if (balancedParenthesis(exp)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}

	}

}
