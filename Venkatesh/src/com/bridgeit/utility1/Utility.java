package com.bridgeit.utility1;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	
	public static Scanner sc=new Scanner(System.in);	//input from user

	/**
	 * @purpose:swapNibbles
	 * @param decimal
	 * @return
	 */
	public static int swapNibbles(int decimal) 
	{
		return ((decimal & 0x0F) <<4  | (decimal & 0xF0) >>4);
	}
	
	/**
	 * @purpose:isPowerTwo
	 * @param num
	 * @return
	 */
	public static boolean isPowerTwo(int num) 
	{
		return (int) (Math.ceil((Math.log(num) / Math.log(2)))) == (int) (Math.floor(((Math.log(num) / Math.log(2)))));
	}
	
	/**
	 * @purpose:toBinary
	 * @param decimal
	 * @return
	 */
	public static char[] toBinary(int decimal) {
		String binaryDigits = "";
		while (decimal > 0) {
			binaryDigits += decimal % 2;
			decimal = decimal / 2;
		}
		return binaryDigits.toCharArray();
	}
	
	/**
	 * @purpose:binarySearch
	 * @param str
	 * @param x
	 * @return
	 */
	public static int binarySearch(String[] str,String x)
	{
		int l=0,r=str.length;
		
		while(l<=r)
		{
			int m=(l+r)/2;
			
			int result=x.compareTo(str[m]);
			
			if(result==0)
			{
				return m;
			}
			else if(result>0)
			{
				l=m+1;
			}
			else
				r=m-1;
		}
		
		return -1;
		
	}
	/**
	 * @purpose:binarySearchInt
	 * @param arr
	 * @param x
	 * @return
	 */
	public static int binarySearchInt(int[] arr,int x)
	{
		int l=0,r=arr.length-1;
		
		while(l<=r)
		{
			int m=(l+r)/2;

			if(arr[m]==x)
			{
				return m;
			}
			else if(arr[m]>x)
			{
				r=m-1;
			}
			else
				l=m+1;
		}
		
		return -1;
		
	}
	/**
	 * @purpose:fahrenheit
	 * @param f
	 * @return
	 */
	
	public static int fahrenheit(int f)
	{
		int c=(f*9/5)+32;
		return c;
	}
	/**
	 * @purpose positiveInteger
	 * @return
	 */
	public static int getPositiveInt() {
		String str;
		int time = 0;
		boolean valid = false;
		while (!valid) {
			try {
				str = Utility.sc.next();
				time = Integer.parseInt(str);
				if (time >= 0)
					valid = true;

			} catch (NumberFormatException e) {
				System.out.println("Error, not a number. Please TRY AGAIN");
			}
		}
		return time;
	}
	/**
	 * @purpose gambler
	 * @param stake
	 * @param goal
	 * @param trials
	 * @return
	 */
	public static int[] playGame(int stake, int goal, int trials) {
		int wins = 0;
		int bets = 0;
		for (int i = 1; i <= trials; i++) {
			int cash = stake;

			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() >= 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal)
				wins++;

		}
		return new int[] { bets, wins };
	}
	
	/**
	 * @purpose day of the week
	 * @param m0
	 * @param d0
	 * @param y0
	 * @return
	 */
	public static int day(int m0,int d0,int y0 )
	{
		y0=y0-(14-m0)/12;
		int x=y0+y0/4-y0/100+y0/400;
		m0=m0+12*((14-m0)/12)-2;
		d0=(d0+x+31*m0/12)%7;
		return d0;
		
	}
	
	/**
	 * @purpose leapyear
	 * @param year
	 * @return
	 */
	 public static boolean isLeapYear(int year) 
	 {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }
	 
	/**
	 * @purpose print time
	 * @param time
	 */
	public static void printTime(long time) {
		int millisec = (int) time % 1000;

		time = time / 1000;

		int secs = (int) time % 60;

		int mins = ((int) time) / 60;

		int hours = mins / 60;

		mins = mins % 60;

		System.out.println("\t Elpased Time : " + hours + ":" + mins + ":" + secs + ":" + millisec);
	}

	/**
	 * @purpose:vendingMachine
	 * @param notes
	 * @param rupee
	 * @return
	 */
	public static int vendingMachine(int[] notes, int rupee) 
	{
		int notecount = 0;
		int count = 0;
		if (rupee == 0)
			return -1;
		
		for (int i = 0; i < notes.length; i++) 
		{
			if (rupee >= notes[i]) 
			{
				notecount = (rupee / notes[i]);
				System.out.println(notes[i] + "\t : " + notecount);
				rupee = (rupee % notes[i]);
				count++;
			}
		}
		
		return count;
	}
	/**
	 * @purpose:payment
	 * @param p
	 * @param y
	 * @param R
	 * @return
	 */
	
	public static double payment(double p,double y,double R)
	{
		double n=12*y;
		double r= R/(12*100);
		double payment=((p*r)/Math.pow((1-(1+r)),-n));
		return payment;
	}
	/**
	 * @purpose:bubbleInt
	 * @param arr
	 * @return
	 */
	public static int[] bubbleInt(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<(arr.length-i-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		return arr;
		
	}
	
	/**
	 * @purpose:guess
	 * @param arr
	 * @param last
	 * @param rare
	 */
	public static void guess(int[] arr, int last, int rare) {
		int mid;
		char ans;
		if (last == rare) 
		{
			System.out.println("Your number is : " + arr[last]);
			return;
		} 
		else 
		{
			mid = (last + rare) / 2;
			System.out.println("Is your number 'equal  or smaller' compared to:" + arr[mid]);
			System.out.println("Enter smaller 'y/n':");
			System.out.println("Enter equal 's':");
			ans = Utility.sc.next().toLowerCase().charAt(0);
			if (ans == 'y')
				guess(arr, last, mid - 1);
			else if (ans == 'n')
				guess(arr, mid + 1, rare);
			else if (ans == 's')
				System.out.println("Your number is : " + arr[mid]);
			else
				System.out.println("your number is not in the range");
		}
	}
	/**
	 * @purpose:insertion
	 * @param arr
	 * @return
	 */
	public static int[] insertion(int[] arr)
	{
		int i,temp,j;
		for(i=1;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
				
			}
			arr[j]=temp;
		}
		
		return arr;
	}
	/**
	 * @purpose:bubbleString
	 * @param arr
	 * @return
	 */
	public static String[] bubbleString(String[] arr)
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	/**
	 * @purpose:2 to 1000 prime numbers
	 * @param num
	 * @return
	 */
	public static int[]prime ()
	{
	  int status = 1;
	  int num=3;
      int[] arr=new int[167];
      int[][]arr1=new int[10][167];
      int i,j;
    
      System.out.println("First 1000 prime numbers are:");   
      for (  i =0 ; i <=166; )
      {
         for (  j = 2 ; j <= Math.sqrt(num) ; j++ )
         {
            if ( num%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
        	
           arr[i]=num;
           i++;
        	
         }
        
         status = 1;
         num++;
         
      }
	return arr;
}
	/**
	 * @purpose:isAnagram
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isAnagram(String str1,String str2)
	{
		String s1=str1.replaceAll("\\s", "");
		String s2=str2.replaceAll("\\s", "");
		boolean status=false;
		
		if(s1.length()!=s2.length())
		{
			status=false;
		}			
		
		char[]arrs1=s1.toLowerCase().toCharArray();
		char[]arrs2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(arrs1);
		Arrays.sort(arrs2);
		
		status=Arrays.equals(arrs1, arrs2);
		
		return status;
		
	}
	/**
	 * @purpose:insertionSort
	 * @param arr
	 * @return
	 */
	public static String[] insertionSort(String[] arr)
	{
		String temp;
		int i,j;
		
		for (i = 0; i <arr.length; i++) {
	        temp = arr[i];
	        j = i - 1;
	        while (j >= 0) {	
	            if (temp.compareTo(arr[j]) > 0) {
	                break;
	            }
	            arr[j + 1] = arr[j];
	            j=j-1;
	        }
	        arr[j + 1] = temp;
	       
	    }
		return arr;
		
	}
	/**
	 * @purpose: String swap
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        
        
        return String.valueOf(charArray); 
    } 
	/**
	 * @purpose:merge
	 * @param arr
	 * @param l
	 * @param m
	 * @param r
	 */

	
	public static void merge(int arr[], int l, int m, int r) 
    { 
         
        int n1 = m - l + 1; 
        int n2 = r - m; 
   
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
        int i = 0, j = 0; 
        int k = l; 
        
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 

        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  /**
   * @purpose:sort
   * @param arr
   * @param l
   * @param r
   */
    public static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            
            int m = (l+r)/2; 
            
            sort(arr, l, m); 
            sort(arr , m+1, r); 
   
            merge(arr, l, m, r); 
        } 
    } 
    /**
     * @purpose:printArray
     * @param arr
     */
    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.println(arr[i] + " "); 
        System.out.println(); 
    	
    } 
	}
	


