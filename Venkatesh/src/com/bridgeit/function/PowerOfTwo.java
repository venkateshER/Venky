package com.bridgeit.function;
/**
 * 
 * @author Venkatesha E R
 * date:23/02/19
 *
 */
public class PowerOfTwo {
	
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);		//taking inputs from args0
		int power=1;
		for(int i=1;i<=n;i++)
		{
			power=power*2;
			System.out.println("2^"+i+"="+power);
			
		}
	}

}
