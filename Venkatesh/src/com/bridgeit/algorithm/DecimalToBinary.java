package com.bridgeit.algorithm;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author  Venkatesha E R
 * date:28/02/19
 *
 */
public class DecimalToBinary {
	
	public static int[] toBinary(int n) {
	
		 
        int[] binary= new int[1000]; 
   
        System.out.println("Binary of "+n+" is:");
        int i = 0; 
        while (n > 0)  
        { 
            
            binary[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   
      
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binary[j]); 
        return binary;
	}
		
	

	public static void main(String[] args) {
		
		System.out.println("Enter a number to convert binary:");
		
		int n=Utility.sc.nextInt();
		int[] binary=toBinary(n);
		

	}

	
		
	

}
