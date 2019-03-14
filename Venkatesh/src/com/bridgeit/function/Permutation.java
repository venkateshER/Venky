package com.bridgeit.function;
import com.bridgeit.utility1.Utility;
/**
 * 
 * @author Venkatesha E R
 * date:23/02/19
 *
 */
public class Permutation {

	public static void main(String[] args) {
		
		 		System.out.println("Enter a String");
		        String str=Utility.sc.next();
		        int n = str.length(); 
		        Permutation permutation = new Permutation(); 
		        System.out.println("String permutation:");
		        permutation.permute(str, 0, n-1); 
		    } 
	
	public void permute(String str, int l, int r ) 
    { 
        if (l == r) 							
        {
        	
            System.out.println(str);
        }
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str =Utility.swap(str,l,i);  //swap the two elements
                permute(str, l+1, r); 
               
               
            } 
        } 
    }
	

}


