package com.bridgeit.oops;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeCreator;

public class InventoryManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Path = "/home/admin1/eclipse-workspace/jsonfiles/inventory.json";
		File file = new File(Path);

		ObjectMapper mapper = new ObjectMapper();
		int num;

		try {
			JsonNode rootNode = mapper.readTree(file);
			// System.out.println(""+rootNode);
			do {
				System.out.println("Enter the Choice");
				System.out.println(" 1:Rice" + "\n 2:Pulses" + "\n 3:Wheat");
				num = sc.nextInt();
			} while (num < 0 || num > 4);

			String inventoryproduct = "";

			switch (num) {
			case 1:
				inventoryproduct = "Rice";
				break;
			case 2:
				inventoryproduct = "Pulses";
				break;
			case 3:
				inventoryproduct = "Wheat";
				break;
			default:
				System.out.println("Invalid Input");

			}

			JsonNode inventory = rootNode.path(inventoryproduct);
			// System.out.println(""+inventory);
			for (JsonNode node : inventory) {
				// System.out.println(""+node);
				String name = node.path("name").asText();
				int price = node.path("price").asInt();
				int weight = node.path("weight").asInt();

				System.out.println("Name:" + name + "\nPrice: " + price + "\nWeight: " + weight);
				System.out.println("total: " + price * weight + " Rs" + "\n");
			}

		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}

	}

}
