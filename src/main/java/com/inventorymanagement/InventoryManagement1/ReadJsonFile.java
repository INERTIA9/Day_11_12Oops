package com.inventorymanagement.InventoryManagement1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {
	public static void main(String[] argd) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(System.getProperty("user.dir") + "//foodstock.json");

		Object obj = jsonparser.parse(reader);

	}

	public static void parse(JSONObject food) {
		JSONObject foodobject = (JSONObject) food.get("Name");
		String foodname = (String) food.getString("Name");
		System.out.println("Nmae:" + foodname);
	}
}
