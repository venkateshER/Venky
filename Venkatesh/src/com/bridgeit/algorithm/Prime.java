package com.bridgeit.algorithm;

import java.util.Scanner;
/**
 * 
 * @author Venkatesha E R
 * date:02/03/19
 *
 */

public class Prime {

	public static void main(String[] args) {
		
	      int status = 1;
	      int num = 3;
	    
	      System.out.println("First 1000 prime numbers are:");   
	      System.out.println(2);
	      for ( int i = 2 ; i <=168; )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	        	
	           System.out.println(num);
	            i++;
	         }
	        
	         status = 1;
	         num++;
	      }
	     
	      
	}

}
