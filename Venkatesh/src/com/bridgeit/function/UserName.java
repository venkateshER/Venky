package com.bridgeit.function;

import java.util.Scanner;


import com.bridgeit.utility1.Utility;

/**
 * 
 * @author Venkatesha E R
 * Date:25/02/19
 *
 */
public class UserName {

	public static void main(String[] args) {
		
		String s1= "Hello <<UserName>>, How are you?";
		System.out.println(""+s1);
		System.out.println("Enter the UserName");
		String name=Utility.sc.next();
		String s2="";
		if(name.length()>3)
		{
			s2=s1.replace("<<UserName>>",name);
			System.out.println(""+s2);
		}
		else
		{
			System.out.println("Enter the proper input");
		}
	}
	

}
