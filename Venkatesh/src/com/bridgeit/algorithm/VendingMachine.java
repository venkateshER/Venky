package com.bridgeit.algorithm;

import java.util.Scanner;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:03/03/19
 *
 */
public class VendingMachine {

	public static void main(String[] args) {
		
		int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int change;
		System.out.println("Enter the change required");
		//Scanner sc=new Scanner(System.in);
		
		change =Utility.sc.nextInt() ;
		int numofnotes = Utility.vendingMachine(notes, change);
		System.out.println("Number of minimum notes required : " + numofnotes);

	}

	}


