package com.bridgeit.oops;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 
 * @author Venkatesha E R
 * date:13/03/19
 *
 */
public class RegularExpression {

	public static void main(String[] args) {
		String path="/home/admin1/eclipse-workspace/jsonfiles/Regularexpression.json";
		File file=new File(path);
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		ObjectMapper mapper=new ObjectMapper();
		try {
			JsonNode rootNode=mapper.readTree(file);
			System.out.println(""+rootNode);
			String values="regular";
			System.out.println(""+values);
			JsonNode regular=rootNode.path(values);
			String str=regular.asText();
			System.out.println(""+str);
			
			System.out.println("Enter the name");
			String name=sc.nextLine();
			
		
			if(Pattern.matches("[a-zA-Z]+", name))					//replacing the name
			{
				str=str.replaceAll("<<name>>", name);				
			}

			System.out.println("Enter the fullname");
			Scanner sc2=new Scanner(System.in);
			String fullname=sc1.nextLine();
			if(Pattern.matches("[a-zA-Z]+",fullname ))				
			{
				str=str.replaceAll("<<full name>>", fullname);			//replacing the fullname
			}

			System.out.println("Enter the phone number ");
			String number=sc2.nextLine();
			if(Pattern.matches("[789][0-9]{9}",number))	
			{
				str=str.replaceAll("x{10}",number);
	}
				
			Date currentDate = new Date();								//reading current date 
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	        String date = sdf.format(currentDate);
	        str=str.replaceAll("dd/mm/yyyy", date);
			
	        System.out.println(""+str);
			
		
			
		} catch (IOException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}

	}

}
