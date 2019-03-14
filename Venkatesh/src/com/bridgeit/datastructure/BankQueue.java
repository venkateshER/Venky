package com.bridgeit.datastructure;

import java.util.Scanner;

public class BankQueue {
	static public String arr[];
	static public int front;
	static public int rear;
	static public int capacity;
	static public int count;
	static Scanner sc = new Scanner(System.in);
	static int banktotal = 500000;

	BankQueue(int size) {
		arr = new String[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	public static int withdraw(int money) {
		if (banktotal > money) {
			banktotal = banktotal - money;
			return banktotal;
		} else {
			System.out.println("not possible");
			return 0;
		}
	}

	public static int credit(int money) {
		banktotal = banktotal + money;
		return banktotal;
	}

	public static void dequeue() {

		if (isEmpty()) {
			System.out.println("total amount in the bank is:" + banktotal);
			System.out.println("UnderFlow\nProgram Terminated");

		}

		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
	}

	public static void enqueue(String item) {

		if (isFull()) {
			System.out.println("OverFlow\nProgram Terminated");

		}

		System.out.println("Adding to queue " + item);

		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	public static String peek() {
		if (isEmpty()) {
			System.out.println("UnderFlow\nProgram Terminated");
			return null;
		}
		return arr[front];

	}

	public static String trancation(int n) {
		Scanner sc2 = new Scanner(System.in);
		int money;
		if (isEmpty()) {
			System.out.println("UnderFlow\nProgram Terminated");
			return null;
		}
		switch (n) {
		case 1:
			System.out.println("how much to add");
			money = sc2.nextInt();
			credit(money);
			System.out.println(peek() + " added");
			System.out.println("total amount in the bank is:" + banktotal);
			break;
		case 2:
			System.out.println("how much to withdraw ");
			money = sc2.nextInt();
			withdraw(money);
			System.out.println(peek() + " withdraw");
			System.out.println("total amount in the bank is:" + banktotal);
			break;
		default:
			System.out.println("follow the queue");

		}
		return arr[front];
	}

	public static int size() {
		return count;
	}

	static void queueDisplay() {
		int i;
		if (front > rear) {
			System.out.println("Queue is Empty");
			return;
		}

		for (i = front; i <= rear; i++) {
			System.out.println(arr[i]);
		}
		return;
	}

	public static Boolean isEmpty() {
		return (size() == 0);
	}

	public static Boolean isFull() {
		return (size() == capacity);
	}

}
