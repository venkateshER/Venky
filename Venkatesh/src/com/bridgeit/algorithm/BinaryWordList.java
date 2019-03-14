package com.bridgeit.algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:26/02/19
 *
 */

public class BinaryWordList {

	public static void main(String[] args) throws IOException {
		
		String[] arr=new String[100];
		//read the elements from the file
		BufferedReader in = new BufferedReader(new FileReader("/home/admin1/Desktop/doc1"));
        String str="";
        StringBuffer sb=new StringBuffer();
        int i;
        
        while(( i= in.read()) != -1)
        {
        	char ch=(char)i;
			str=Character.toString(ch);
			sb=sb.append(str);    
         }
         System.out.println("Elements in text file:");
         System.out.println(sb);
         
         String str1=sb.toString();
         arr=str1.split(" ");
         
         for(i=0;i<arr.length;i++)							//sorting
         {
        	 for(int j=i;j<arr.length;j++)
        	 {
        		 if(arr[i].compareTo(arr[j])>0)
        		 {
        			 String temp=arr[i];
        			 arr[i]=arr[j];
        			 arr[j]=temp;
        		 }
        	 }
        	 
         }
        
         System.out.println("Enter the string to search:");
         String key=Utility.sc.next();
         
         int result=Utility.binarySearch(arr,key);
         
         if(result==-1)
         {
        	 System.out.println("not found");
        	 
         }
         else
         System.out.println(key+" found");
         
        
         
         
        }
	

	}


