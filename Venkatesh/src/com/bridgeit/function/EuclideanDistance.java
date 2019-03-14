package com.bridgeit.function;

/**
 * 
 * @author Venkatesha E R
 * Date:21/02/19
 *
 */
public class EuclideanDistance {

	public static void main(String[] args) {
		
		int x=Integer.parseInt(args[0]);		//taking input from args0
		int y=Integer.parseInt(args[1]);		//taking input from args1
		
		double distance=Math.sqrt(x*x+y*y);
		
		System.out.println("Euclidean distance "+distance);
		

	}

}
