package com.bridgeit.function;

import java.util.Scanner;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 *date:25/02/19
 */
public class SumOfThree {

	public static void main(String[] args) {
		
		System.out.println("Enter the integer number");
		int [] arr=new int[1000];
		int n=Utility.sc.nextInt();
		int m=0;
		
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		
			arr[i]=Utility.sc.nextInt();
		
			m=arr.length;
		
		for(int i=0;i<m;i++)
		{
			
			for(int j=i+1;j<m;j++)
			{
				
				for(int k=j+1;k<n;k++)
				{
					
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+0);
					}
					else
					{
						System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+1);
					}
						
				}
			}
		}
		
	}

}
