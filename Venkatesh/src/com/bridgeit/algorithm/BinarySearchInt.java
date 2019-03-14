package com.bridgeit.algorithm;
import java.util.Arrays;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:26/02/19
 *
 */
public class BinarySearchInt {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		int n=Utility.sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=Utility.sc.nextInt();
		}
		
		
		
		int i,j;	
		for(i=0;i<arr.length;i++)								//sorting 
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorted:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//Arrays.sort(arr);
		System.out.println("Enter the element to search");
		int key=Utility.sc.nextInt();
		
		int result=Utility.binarySearchInt(arr, key);
		
		if(result==-1)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found at:"+result);
		}

	}

}
