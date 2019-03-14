package com.bridgeit.function;

import java.util.Scanner;
/**
 * 
 * @author Venkatesha E R
 * date:23/02/19
 *
 */
public class Quadratic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a,b,c value to find qudratic eqution");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		double delta = b*b - 4*a*c;
		double root1= (-b + Math.sqrt(delta))/(2*a);
		double root2= (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("first root of x is "+root1);
		System.out.println("second root of y is "+root2);
	}

		
		
		

	}


