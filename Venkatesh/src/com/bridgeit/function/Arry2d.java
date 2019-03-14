package com.bridgeit.function;

import java.util.Scanner;

import com.bridgeit.utility1.Utility;
 /**
  * @author Venkatesha E R
  * date:  21/02/19
  */

public class Arry2d {

	public static void main(String[] args) {
		
		System.out.println("Enter the rows and column values");
		int rows=Utility.sc.nextInt();								
		int col=Utility.sc.nextInt();
		int arr[][]=new int[rows][col];
		
		System.out.println("Enter the elements");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=Utility.sc.nextInt();
			}
		}
		for(int i[]:arr)						//adding elements of arr[][] array to i[] 
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
			
		}
		
	}

}

