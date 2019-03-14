package com.bridgeit.function;

import java.util.Scanner;

import com.bridgeit.utility1.Utility;

/**
 * @author Venkatesha E R
 * date: 21/02/19
 *
 */

public class Coin {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of times coin to flip");
		int n=Utility.sc.nextInt();
		int heads=0,tails=0;
		
		for(int i=0;i<n;i++)
		{
			double random=Math.random();		//generate random numbers from 0 to 0.9
			if(random<0.5)
				
			{
				++heads;
				
			}
			else
				++tails;
		}
		System.out.println("Number of heads are "+heads);
		System.out.println("Number of tails are "+tails);
		double avgheads=(heads*100)/n;
		double avgtails=(tails*100)/n;
		System.out.println("percentage of heads "+avgheads+"%");
		System.out.println("percentage of tails "+avgtails+"%");
	
	}

}
