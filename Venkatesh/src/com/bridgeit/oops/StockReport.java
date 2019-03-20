package com.bridgeit.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
/**
 * 
 * @author Venkatesha E R
 * date:14/03/19
 *
 */
public class StockReport {
	
	private List<Stocks> stacks;

	public List<Stocks> getStocks() {
		return stacks;
	}

	public void setStocks(List<Stocks> stacks) {
		this.stacks = stacks;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the number of users to store");
		int n;
		n = sc2.nextInt();

		try {
			ObjectMapper mapper = new ObjectMapper();
			List<Stocks> stocks = new ArrayList();

			for (int i = 0; i < n; i++) {							
				System.out.println("Enter the user name");
				String name = sc.nextLine();

				System.out.println("Enter the company name");
				String company = sc.nextLine();

				System.out.println("Enter the Symbol of company");
				String symbol = sc.nextLine();

				System.out.println("Enter the number of shares");
				int shares = sc1.nextInt();

				System.out.println("Enter the price");
				int price = sc1.nextInt();

				int totalprice = shares * price;
				System.out.println("The total price is:" + totalprice);
				System.out.println("Done");
				System.out.println();

				Stocks s = new Stocks();
				s.setName(name);
				s.setCompany(company);
				s.setSymbol(symbol);
				s.setShares(shares);
				s.setPrice(price);
				s.setTotalprice(totalprice);
				stocks.add(s);

			}
			mapper.writeValue(new File("/home/admin1/eclipse-workspace/jsonfiles/stacks.json"), stocks);

			StockReport st = new StockReport();
			st.setStocks(stocks);

			for (Stocks s : st.getStocks()) {
				System.out.println("User Name:" + s.getName() + "\nCompany Name:" + s.getCompany() + "\nCompany Symbol:"
						+ s.getSymbol() + "\nShares:" + s.getShares() + "\nPrice:" + s.getPrice() + "\nTotal Price:"
						+ s.getTotalprice() + "\n");

			}

		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}

	}

}
