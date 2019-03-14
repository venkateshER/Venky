package com.bridgeit.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataManagement 

{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String Path="/home/admin1/eclipse-workspace/jsonfiles/inventory.json";
	File file=new File(Path);
	
	
	
	ObjectMapper mapper=new ObjectMapper();
	try {
		JsonNode rootNode=mapper.readTree(file);
		JsonNode inventory=rootNode.get("Rice");
		System.out.println("=====RICE=====");
		for(JsonNode node:inventory)
		{
			//System.out.println(""+node);
			String name=node.path("name").asText();
			int price=node.path("price").asInt();
			int weight=node.path("weight").asInt();
			
			System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
			System.out.println("total: "+price*weight+" Rs"+"\n");
		}
		JsonNode inventory1=rootNode.get("Pulses");
		
		System.out.println("====PULSES====");
		for(JsonNode node:inventory1)
		{
			//System.out.println(""+node);
			String name=node.path("name").asText();
			int price=node.path("price").asInt();
			int weight=node.path("weight").asInt();
			
			System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
			System.out.println("total: "+price*weight+" Rs"+"\n");
		}
		
		JsonNode inventory2=rootNode.get("Wheat");
		System.out.println("====WHEAT====");
		for(JsonNode node:inventory2)
		{
			//System.out.println(""+node);
			String name=node.path("name").asText();
			int price=node.path("price").asInt();
			int weight=node.path("weight").asInt();
			
			System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
			System.out.println("total: "+price*weight+" Rs"+"\n");
		}
	
	} catch (IOException e) {
		System.out.println(""+e.getMessage());		
		e.printStackTrace();
	}
	 
	}

}
