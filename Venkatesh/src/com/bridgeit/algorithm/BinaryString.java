package com.bridgeit.algorithm;

import java.util.Arrays;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:26/02/19
 *
 */

public class BinaryString {
	

		public static void main(String[] args) {
			
			System.out.println("Enter a number");
			int n=Utility.sc.nextInt();
			String[] str=new String[n+1];
			
			System.out.println("Enter the elements");
			for(int i=0;i<str.length;i++)
			{
				str[i]=Utility.sc.nextLine();
			}
			
			
			Arrays.sort(str);								//sort the elements
			
			System.out.println("sorted:");
			for(int i=1;i<str.length;i++)
			{
				System.out.println(str[i]);
			}
			
			System.out.println("Enter the word to search");
			String x=Utility.sc.nextLine();
			
			int result=Utility.binarySearch(str,x);
			
			if(result==-1)
			{
				System.out.println("not found");
			}
			else
			{
				System.out.println("found at " +result);
			}

		}

		

	}



