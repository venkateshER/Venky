package com.bridgeit.function;

import java.util.Scanner;
/**
 * 
 * @author Venkatesha E R
 * Date: 25/02/19
 *
 */

public class WindChill {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter the temperature t and speed v");
		System.out.println("Enter t value more than 50");
		System.out.println("Enter v value more than 3 and less than 120");
		
		double t=sc.nextInt();
		double v=sc.nextInt();
		
		double f=Math.pow(v, 0.16);
		if(t>50 && v<120 && v>3)
		{
			double w=35.74+0.6215*t+((0.4275*t)-35.75)*f;
			System.out.println("the temperature of windchill "+w);
		}
		else
		System.out.println("invalid");
		
		

	}

}
