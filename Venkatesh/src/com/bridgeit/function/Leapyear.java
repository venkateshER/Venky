package com.bridgeit.function;

import java.util.*;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:22/02/19
 *
 */
public class Leapyear {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the year to find leap or not");
		int year=Utility.sc.nextInt();
		if(year%4==0||year%400==0)		
		{
			System.out.println(year+" is leap year");
		}
		else
		System.out.println(year+" is not leap year");
	}

}
