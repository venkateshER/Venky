package com.bridgeit.algorithm;

import java.util.Arrays;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:26/02/19
 *
 */

public class Anagram {

		
	public static void main(String [] args)
	{
		System.out.println("Enter the two strings to check anagram");
		String str1=Utility.sc.next();
		String str2=Utility.sc.next();
		boolean status1=Utility.isAnagram(str1, str2);	
		if(status1)
		{
			System.out.println("Two Strings are Anagram");
		}
		
		else
		{
			System.out.println("not anagram");
		}
		
	
	}
		
	}


