package com.bridgeit.datastructure;

import com.bridgeit.utility1.Utility;

/**
 * 
 * @author Venkatesha E R date:06/03/19
 *
 */
public class Calendar {

	public static void main(String[] args) {
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);

		if (month == 2 && Utility.isLeapYear(year)) {
			date[month] = 29;
		}

		int day = Utility.day(month, 1, year);
		int arr[][] = new int[6][7];
		int x = 1;

		for (int i = 0; i < 6; i++) {
			for (int j = day; j < 7; j++) {
				if (x <= date[month]) {
					arr[i][j] = x;
					x++;
					// System.out.println(""+x);
				}
			}
			day = 0;
		}

		// for (int j = 0; j < days; j++)
		// {
		// A[0][j] = A[5][j] = 0;
		// }
		//

		System.out.println(" " + months[month] + " " + d + " " + year);
		System.out.println("  Su  Mon Tue Wed Thu Fri Sat");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] != 0)
					System.out.printf("%4d", arr[i][j]);
				else
					System.out.printf("    ");
			}
			System.out.println();
		}

	}

}
