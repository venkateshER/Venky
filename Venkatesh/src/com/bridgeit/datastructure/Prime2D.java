package com.bridgeit.datastructure;

import com.bridgeit.utility1.Utility;

/**
 * 
 * @author Venkatesha E R date:08/03/19
 *
 */
public class Prime2D {

	public static void main(String[] args)

	{

		int[] arr = Utility.prime();
		System.out.print(2 + " ");
		int[][] arr1 = new int[10][167];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 167; j++) {
				if (arr[j] > ((i) * 100) && arr[j] < ((i + 1) * 100)) {

					arr1[i][j] = arr[j];
					System.out.print(arr1[i][j] + " ");
				}

			}
			System.out.println();
		}
	}

}
