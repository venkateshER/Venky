package com.bridgeit.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgeit.utility.LinkedList;
import com.bridgeit.utility1.Utility;

/**
 * 
 * @author Venkatesha E R date:07/03/19
 *
 */

public class UnorderedList {

	public static void main(String[] args) throws IOException {

		LinkedList ls = new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		int i;
		BufferedReader in = new BufferedReader(new FileReader("/home/admin1/eclipse-workspace/Venkatesh/doc1"));
		StringBuffer sb = new StringBuffer();
		String str = "";
		String[] arr = new String[1000];

		while ((i = in.read()) != -1) {
			char c = (char) i;
			str = Character.toString(c);
			sb = sb.append(str);

		}
		System.out.println("" + sb);
		str = sb.toString();
		arr = str.split(" ");

	
		for (i = arr.length - 1; i >= 0; i--) {
			ls.push(arr[i]);
		}

		ls.size();

		System.out.println("Enter the string to search");
		String key = Utility.sc.next();

		// ls.print();

		if (ls.find(key)) {
			System.out.println();
			System.out.println(key + " is found");
			System.out.println("removed from the list");
			ls.search(key);

		} else {
			System.out.println();
			System.out.println(key + " is not found");
			System.out.println("added to the list");
			ls.last(key);
		}

		ls.print();
		ls.write1();

	}

}
