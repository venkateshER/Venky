package com.bridgeit.algorithm;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:02/03/19
 *
 */

public class Newtons 
{
	static double sqrt()
	{
	System.out.println("Enter a value to find newton");
	int c=Utility.sc.nextInt();
	double t=Math.sqrt(c);
	double epsilon = 3.0509E-7;
	
	while(Math.abs(t - c/t) > epsilon*t)
	{
		t=(t+(c/t))/2.0;
	}
		return t;
	}
	
	public static void main(String[] args)

	{
		double result=sqrt();
		System.out.println("newton's law "+result);
	}
}


	
	
	
	
	
	
	
	
	


