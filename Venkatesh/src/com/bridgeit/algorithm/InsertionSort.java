package com.bridgeit.algorithm;

import java.util.Scanner;

import com.bridgeit.utility1.Utility;


/**
 * 
 * @author  Venkatesha E R
 * date:28/02/19
 *
 */
public class InsertionSort {

public static void main(String[] args) {
		
		int i,temp,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		long starttime=System.nanoTime();
		int[]arr1=Utility.insertion(arr);
		System.out.println("sorted");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(""+arr[i]);
		}
		long endtime=System.nanoTime();
		double elapse=(endtime-starttime)/1000.0;
		System.out.println("Elapse time:"+elapse);
}
}
