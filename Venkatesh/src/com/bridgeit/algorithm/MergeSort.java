package com.bridgeit.algorithm;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author  Venkatesha E R
 * date:01/03/19
 *
 */

public class MergeSort {

	    public static void main(String args[]) 
	    { 
	        System.out.println("Enter a number");
	        int n=Utility.sc.nextInt();
	        int[] arr=new int[n];
	        
	        System.out.println("Enter the elements");
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=Utility.sc.nextInt();
	        }
	    
	        long starttime=System.nanoTime();
	  
	         
	        Utility.sort(arr, 0, arr.length-1); 
	    
	        System.out.println("\nSorted array"); 
	        Utility.printArray(arr);
	        
	        long endtime=System.nanoTime();
	        double elapsetime=(endtime-starttime)/1000.0;
	        
	        System.out.println("Elapse time:"+elapsetime);
	    } 

	}


