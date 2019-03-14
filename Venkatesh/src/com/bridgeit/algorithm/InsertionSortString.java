package com.bridgeit.algorithm;

import java.util.Arrays;

import com.bridgeit.utility1.Utility;

/**
 * 
 * @author  Venkatesha E R
 * date:28/02/19
 *
 */
public class InsertionSortString {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to insert elements");
		
		int n=Utility.sc.nextInt();
	    int i,j;
	    String temp;
	    String[] arr = new String[n];
	    
	    System.out.println("Enter the elements");
	    for(i=0;i<arr.length;i++)
	    {
	    	arr[i]=Utility.sc.next();
	    }
	    long starttime=System.nanoTime();
	    String[] arr1=Utility.insertionSort(arr);
	    
	    System.out.println("sorted:");
	    for(i=0;i<arr1.length;i++)
	    {
	    	System.out.println(""+arr1[i]);
	    }
	    long endtime=System.nanoTime();
	    double elapcetime=(endtime-starttime)/1000.0;
	    
	    System.out.println("elapce time: "+elapcetime);
	}

}
