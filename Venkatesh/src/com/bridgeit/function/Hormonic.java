package com.bridgeit.function;

import java.util.Scanner;

import com.bridgeit.utility1.Utility;

/**
 * 
 * @author Venkatesha E R
 *date:22/02/19
 */
public class Hormonic {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a number");
		int n=Utility.sc.nextInt();
		double sum=0;
			
		if(n!=0)
		{
			for(int i=1;i<=n;i++)
			{
				sum=sum+(1.0/i);
			}
			System.out.println("Sum of hormonic number "+sum);
		}
		
		

	}

}
