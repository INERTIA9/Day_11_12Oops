package com.inventorymanagement.InventoryManagement1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.*;

public class ReadJsonFile {
	public static void main(String[] arg) {
		JSONParser parser = new JSONParser();

		try (FileReader reader = new FileReader(
				"D:/InventoryManagement1/src/main/java/com/inventorymanagement/InventoryManagement1/foodinventory.json")) {
			Object obj = parser.parse(reader);
			JSONArray foodstocklist = (JSONArray) obj;
			System.out.println(foodstocklist);
			// using iterator
			foodstocklist.forEach(foods -> parseFoodObj((JSONObject) foods));
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();

		}
	}

	private static void parseFoodObj(JSONObject foods) {
		JSONObject foodsobj = (JSONObject) foods.getJSONObject("food");
		// get foodname
		String name = (String) foodsobj.get("Name");
		int price = (int) foodsobj.get("Price");
		int weight = (int) foodsobj.get("Weight");
		System.out.println("Name :" + name);
		System.out.println("Price:" + price);
		System.out.println("Weight :" + weight);
	}
}