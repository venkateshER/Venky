package com.bridgeit.oops.AddressBook;


import java.io.File;
import java.util.Scanner;

//import utility.UtilityMethods;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		FileSystem fileSystem = new FileSystem();
		System.out.println("Enter the file name:");
		String fileName = sc.nextLine();
		File file = fileSystem.createNewFile(fileName, "json");
	}
}
