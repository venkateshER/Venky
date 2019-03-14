package com.bridgeit.algorithm;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:01/03/19
 *
 */

public class MonthlyPayment {

	public static void main(String[] args) {
		
		double p=Integer.parseInt(args[0]);
		double y=Integer.parseInt(args[1]);
		double R=Integer.parseInt(args[2]);
		
		double result=Utility.payment(p, y, R);
		
		System.out.println("monthly payment is "+result);

	}

}
