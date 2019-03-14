package com.bridgeit.algorithm;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:26/02/19
 *
 */

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		
		int decimal;
		
		System.out.println("Enter the positive number");
		decimal=Utility.sc.nextInt();

		
		System.out.println("Decimal Number  : " + decimal);
		
		char[] temp = Utility.toBinary(decimal);			// convert to binary
		String binary = new String(temp);
		StringBuffer sb = new StringBuffer(binary);
		
		sb.reverse();
		binary = sb.toString();
		System.out.println("Binary equivalent of " + decimal + " : " + binary);
		
		String[] arr=new String[binary.length()];
		
		int swapped = Utility.swapNibbles(decimal);				//swap the 0's and 1's
		temp = Utility.toBinary(swapped);
		binary = new String(temp);
		sb = new StringBuffer(binary);
		
		sb.reverse();
		binary = sb.toString();
		
		int toInt = Integer.parseInt(binary,2);
		System.out.println("After swapping nibble binary equivalent :" + binary);
		System.out.println("After swapping nibble decimal equivalent :" + toInt);
		
		boolean isPowerOf2 = Utility.isPowerTwo(toInt);
		if (isPowerOf2)
			System.out.println(toInt + " is  power 2");
		else
			System.out.println(toInt + " is  not a power 2");
	}

}


