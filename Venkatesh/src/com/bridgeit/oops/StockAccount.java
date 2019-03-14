package com.bridgeit.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StockAccount {

	int amount;
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	static List<Stocks> stocks = new ArrayList();
	static ObjectMapper mapper = new ObjectMapper();
	//static 
	StockAccount(String filename) {

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		

		try {
			
			//List<Stocks> stocks = new ArrayList();
			int i=0;
			int arr[]=new int[100];
				
				String name = filename;

				System.out.println("Enter the Id");
				String id = sc.nextLine();

//				System.out.println("Enter the number of shares");
//				int shares = sc1.nextInt();

				System.out.println("Enter the price");
				int price = sc1.nextInt();

				//int totalprice = shares * price;
				//System.out.println("The total price is:" + totalprice);
				System.out.println("Done");
				System.out.println();

				Stocks s = new Stocks();
				s.setName(name);
				//s.setCompany(company);
				s.setSymbol(id);
				//s.setShares(shares);
				s.setPrice(price);
				//s.setTotalprice(totalprice);
				stocks.add(arr[i], s);
				StringBuffer sb=new StringBuffer();
				//sb=sb.append(stocks.add(s));
				
			
			mapper.writeValue(new File("/home/admin1/eclipse-workspace/jsonfiles/persons.json"),stocks);
			i++;
			StockReport st = new StockReport();
			st.setStocks(stocks);

			for (Stocks s1 : st.getStocks()) {
				System.out.println("User Name:" + s1.getName()+ "\nCompany Symbol:"+ s1.getSymbol() + "\nPrice:" + s1.getPrice()+"\n");
				
			}

		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void buy(int amount, String symbol) {
		int shares = 100;
		int price = 5000;
		int companyamount = 1000000;
		int share;
		int total;
		Scanner sc = new Scanner(System.in);
		try {
			JsonNode rootNode=mapper.readTree(new File("/home/admin1/eclipse-workspace/jsonfiles/persons.json"));
			System.out.println(""+rootNode);
			String name="";
			String symbol1="";
			int price1;
			for(JsonNode node:rootNode)
			{
				 name = node.path("name").asText();
				 symbol1 = node.path("symbol").asText();
				price1 = node.path("price").asInt();
				System.out.println("Name:" + name + "\nPrice: " + price1 +"\nsymbol:"  +symbol1 );
			}
			//String account = rootNode.path("symbol").asText();
			//String symbol1=account.path("symbol").asText();
//			for (JsonNode node : account) {
				// System.out.println(""+node);
//				String name = node.path("name").asText();
//				String symbol1= node.path("symbol").asText();
//				int amount1 = node.path("price").asInt();

				
				//System.out.println("total: " + price * weight + " Rs" + "\n");
			
		} catch (IOException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
		StockReport st = new StockReport();
		st.setStocks(stocks);
		Stocks s=new Stocks();
//		String name=s.getName();
//		System.out.println(""+name);
		System.out.println("Select the company");
		int n;
		
			System.out.println("1:google\n2:facebook\n3:apple");
			n = sc.nextInt();
		
		
		switch (n) {
		case 1:
			System.out.println("Enter the how many shares");
			share = sc.nextInt();
			total = share * price;
			if (total <= amount) {
				companyamount -= total;
				System.out.println("total amount:"+total);
			} else {
				System.out.println("not possible");
			}
			break;
		case 2:
			System.out.println("Enter the how many shares");
			share = sc.nextInt();
			total = share * price;
			if (total <= amount) {
				companyamount -= total;
				System.out.println("total amount:"+total);
			} else {
				System.out.println("not possible");
			}
			break;

		case 3:
			System.out.println("Enter the how many shares");
			share = sc.nextInt();
			total = share * price;
			if (total <= amount) {
				companyamount -= total;
				System.out.println("total amount:"+total);
			} else {
				System.out.println("not possible");
			}
			break;
			default:System.out.println("Enter the proper input");

		}
		// StockAccount s=new StockAccount(symbol);
		// total=s.amount-amount;
		// System.out.println("Total amount");
	}

	public static void sell(int amount, String symbol) {
		int shares = 100;
		int price = 5000;
		int companyamount = 1000000;
		int share;
		int total;
		Scanner sc = new Scanner(System.in);

		System.out.println("Select the company");
		int n;
		
			System.out.println("1:google\n2:facebook\n3:apple");
			n = sc.nextInt();
		
		
		switch (n) {
		case 1:
			System.out.println("Enter the how many shares");
			share = sc.nextInt();
			total = share * price;
			if (total <= amount) {
				companyamount += total;
				System.out.println("total amount:"+total);
			} else {
				System.out.println("not possible");
			}
			break;
		case 2:
			System.out.println("Enter the how many shares");
			share = sc.nextInt();
			total = share * price;
			if (total <= amount) {
				companyamount += total;
				System.out.println("total amount:"+total);
			} else {
				System.out.println("not possible");
			}
			break;

		case 3:
			System.out.println("Enter the how many shares");
			share = sc.nextInt();
			total = share * price;
			if (total <= amount) {
				companyamount += total;
				System.out.println("total amount:"+total);
			} else {
				System.out.println("not possible");
			}
			break;
			default:System.out.println("Enter the proper input");

		}
	}
	
	public static void company()
	{
		Scanner sc=new Scanner(System.in);
		String Path="/home/admin1/eclipse-workspace/jsonfiles/company.json";
		File file=new File(Path);
		
		
		
		ObjectMapper mapper=new ObjectMapper();
		try {
			JsonNode rootNode=mapper.readTree(file);
			JsonNode company=rootNode.get("Google");
			System.out.println("=====Google=====");
			for(JsonNode node:company)
			{
				//System.out.println(""+node);
				String name=node.path("name").asText();
				String Symbol=node.path("symbol").asText();
				int shares=node.path("shares").asInt();
				int price=node.path("price").asInt();
				
				System.out.println("Name:"+name+"\nSymbol: "+price+"\nShares: "+shares+"\nPrice: "+price );
				System.out.println("total: "+price*shares+" Rs"+"\n");
			}
			JsonNode company1=rootNode.get("Facebook");
			
			System.out.println("====FaceBook====");
			for(JsonNode node:company1)
			{
				//System.out.println(""+node);
				String name=node.path("name").asText();
				String Symbol=node.path("symbol").asText();
				int shares=node.path("shares").asInt();
				int price=node.path("price").asInt();
				
				System.out.println("Name:"+name+"\nSymbol: "+price+"\nShares: "+shares+"\nPrice: "+price );
				System.out.println("total: "+price*shares+" Rs"+"\n");
			}
			
			JsonNode company2=rootNode.get("Apple");
			System.out.println("====Apple====");
			for(JsonNode node:company2)
			{
				//System.out.println(""+node);
				String name=node.path("name").asText();
				String Symbol=node.path("symbol").asText();
				int shares=node.path("shares").asInt();
				int price=node.path("price").asInt();
				
				System.out.println("Name:"+name+"\nSymbol: "+price+"\nShares: "+shares+"\nPrice: "+price );
				System.out.println("total: "+price*shares+" Rs"+"\n");
			}
		
		} catch (IOException e) {
			System.out.println(""+e.getMessage());		
			e.printStackTrace();
		}
	}

	// public static double valueof()
	// {
	//
	// }
	public static void save(String filename) {

		ObjectMapper mapper = new ObjectMapper();
		List<Stocks> stocks = new ArrayList();

		System.out.println("Done");
		System.out.println();

		Stocks s = new Stocks();

		stocks.add(s);

		try {
			mapper.writeValue(new File("/home/admin1/eclipse-workspace/jsonfiles/stacks.json"), stocks);
		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the choice");
		int n;
		int amount=50000;
		String str="";

			System.out.println(" 1:Create account\n 2:Buy\n 3:Sell\n 4:Save\n 5:PrintReport");
			n = sc.nextInt();
			switch(n)
			{
			case 1:	System.out.println("Enter the name");
					 str= sc1.nextLine();
					StockAccount sa = new StockAccount(str);
					break;
			case 2:System.out.println("Enter the name");
					str=sc1.nextLine();
					buy(amount,str);
					break;
			case 3:System.out.println("Enter the name");
					str=sc1.nextLine();
					sell(amount,str);
					break;
			case 4:System.out.println("save");
					break;
			case 5:System.out.println("printreport");
					System.out.println("1:companys\n2:people");
					int m;
					m=sc.nextInt();
					switch(m)
					{
					case 1:System.out.println("company");
							company();
						break;
					case 2:System.out.println("people");
						break;
					default: System.out.println("Enter the proper input");
					
					}
			
					break;
			default:System.out.println("Enter the valid input");
			}
	
	}

}
