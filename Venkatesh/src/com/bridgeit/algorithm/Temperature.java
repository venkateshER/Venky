package com.bridgeit.algorithm;
import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:02/03/19
 *
 */

public class Temperature {

	public static void main(String[] args) {
		
		System.out.println("Enter celsius to fahrenheit");
		int temper=Utility.sc.nextInt();
		
		int f=(temper*9/5)+32;
		//int c=(f-32)*5/9;
		
		
		int celsius=Utility.fahrenheit(f);
		//System.out.println("Fahrenheit to celsius "+f);
		System.out.println("celsius to fahrenheit "+celsius);
	}

}
