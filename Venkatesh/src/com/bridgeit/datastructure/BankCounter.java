package com.bridgeit.datastructure;

import java.util.Scanner;

/**
 * 
 * @author Venkatesha E R date:06/03/19
 *
 */
public class BankCounter {
	public static void main(String[] args) {
		
		BankQueue q = new BankQueue(100);

		Scanner sc = new Scanner(System.in);
		String str = "";
		int n;
		do {
			System.out.println("1 to enter the queue");
			System.out.println("2 to remove from the queue");
			System.out.println("3 to total queue");
			n = sc.nextInt();
			switch (n) {
			case 1:
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter the name");
				str = sc1.nextLine();
				q.enqueue(str);
				break;

			case 2:
				Scanner sc3 = new Scanner(System.in);
				System.out.println("front:" + q.peek());
				System.out.println("1 to add and 2 to withdraw the money");
				int m = sc3.nextInt();
				q.trancation(m);
				System.out.println("dequeue");
				q.dequeue();
				System.out.println("front:" + q.peek());
				break;
			case 3:
				System.out.println("size:" + q.count);
				q.queueDisplay();
				break;
			default:
				System.out.println("not get");
			}
		} while (n > 0 && n <= 3);

	}

}
