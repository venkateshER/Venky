package com.bridgeit.algorithm;

import java.util.Scanner;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:27/02/19
 *
 */

public class BubbleString {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter a number:");
		int n=Utility.sc.nextInt();
		int i;
		String[] str=new String[n+1];
		System.out.println("Enter the elements:");
		for(i=0;i<str.length;i++)
		{
		
			str[i]= Utility.sc.nextLine();
		}
		
		long starttime=System.nanoTime();
		
		String[] str1=Utility.bubbleString(str);
		
		System.out.println("sorted array:");
		for(i=0;i<str1.length;i++)
		{
			System.out.println(""+str[i]);
		}
		long endtime=System.nanoTime();
		double elapse=(endtime-starttime)/1000.0;
		System.out.println("Elapse time:"+elapse);
		
		
	}

}
