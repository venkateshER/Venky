package com.bridgeit.datastructure;

import com.bridgeit.datastructure.utility.Stack;
import com.bridgeit.utility1.Utility;

/**
 * 
 * @author Venkatesha E R date:08/03/19
 *
 */
public class AnagramStack {

	public static void main(String[] args) {
		Stack a = new Stack(158);
		int i;
		String str = " ";
		String str1 = "";
		String add = " ";
		String[] str2 = new String[167];
		String s = "";
		int arr[] = Utility.prime();

		String[] strarr = new String[arr.length];
		StringBuffer sb = new StringBuffer(arr.length);

		for (i = 0; i < arr.length; i++) {
			add = sb.append(arr[i] + " ").toString();
		}

		strarr = add.split(" ");

		System.out.println("Prime Anagram");
		System.out.println(" Push:");
		for (i = 0; i < strarr.length - 1; i++) {
			for (int j = i + 1; j < strarr.length - 1; j++) {
				str = strarr[i].toString();
				str1 = strarr[j].toString();
				boolean status = Utility.isAnagram(str, str1);

				if (status) {
					// System.out.println(""+strarr[j]);
					a.push(strarr[i]);
					a.push(strarr[j]);

				}

			}

		}
		System.out.println();
		System.out.println(" Pop:");
		for (i = 0; i < a.size; i++) {
			a.pop();
			// System.out.println(""+s);
		}

	}

}
