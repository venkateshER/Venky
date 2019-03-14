package com.bridgeit.algorithm;
import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:27/02/19
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter the number of elements");
		int n=Utility.sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements");
		
		
		for(i=0;i<n;i++)
		{
			arr[i]=Utility.sc.nextInt();
		}
		
		long starttime=System.nanoTime();
		int[] arr1=Utility.bubbleInt(arr);
		
		System.out.println("Sorted:");
		for(i=0;i<arr1.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		long endtime=System.nanoTime();
		double elapcetime=(endtime-starttime)/1000.0;
		
		System.out.println("time elapce:"+elapcetime);
		
		
		
		
		
	}

}
