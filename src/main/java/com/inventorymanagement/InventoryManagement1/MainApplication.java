package com.inventorymanagement.InventoryManagement1;

import org.json.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.*;
import org.json.simple.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.*;

public class MainApplication {
	static List myfoodlist = new ArrayList();
	static JSONArray foodstockArray = new JSONArray();
	static JSONObject jsonobject = new JSONObject();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {

		MainApplication.add();

	}

	public static void add() {
		JSONObject rice = new JSONObject();

		rice.put("Name", "Rice");
		rice.put("Weight", 10);
		rice.put("Price", 100);
		JSONArray riceArray = new JSONArray();
		riceArray.add(rice);
		jsonobject.put("food", riceArray);
		foodstockArray.add(jsonobject);
		myfoodlist.add(jsonobject);

		try {
			FileWriter file = new FileWriter(System.getProperty("user.dir") + "//foodstock.json");
			file.write(foodstockArray.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(System.getProperty("user.dir"));
		System.out.print(foodstockArray);
		System.out.print(myfoodlist);
	}
}
