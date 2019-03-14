package com.bridgeit.algorithm;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 *date:03/03/19
 */
public class PrimeAnagram 
{
	public static void main(String[] args)
	{
		int i;
		String str=" ";
		String str1=" ";
		String add=" ";
		
		
		int arr[]=Utility.prime();
		
		String[] strarr=new String[arr.length];
		
		StringBuffer sb=new StringBuffer(arr.length);
		
		
		for(i=0;i<arr.length;i++)
		{
			add=sb.append(arr[i]+" ").toString();
		}
		
		strarr=add.split(" ");
		System.out.println("Prime Anagram");
			for(i=0;i<strarr.length-1;i++)
			{
				for(int j=i+1;j<strarr.length-1;j++)
				{
					str=strarr[i].toString();
					str1=strarr[j].toString();
					boolean status=Utility.isAnagram(str, str1);
					
					if(status)
					{
						System.out.println(""+strarr[i]+" "+strarr[j]);
							
					}
					
				}
				
			}
		
		}
	}
