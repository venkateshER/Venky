package com.bridgeit.function;

import java.util.Scanner;

/**
 * 
 * @author Venkatesha E R
 * date:21/02/19
 *
 */
public class Coupon {

    
    	public static int getCoupon(int n) {
            return (int) (Math.random() * n);
        }

       
        public static int collect(int n) {
            boolean[] isCollected = new boolean[n];  
            int count = 0;                          
            int distinct  = 0;                      

           
            while (distinct < n) {
                int value = getCoupon(n);             
                count++;                             
                if (!isCollected[value]) {           
                    distinct++;
                    isCollected[value] = true;
                }
            }
            return count;
        }

       
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            int count = collect(n);
            System.out.println(count);
        } 

}
