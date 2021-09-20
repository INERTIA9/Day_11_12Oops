package com.inventorymanagement.InventoryManagement1;

import org.json.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.*;
import org.json.simple.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.*;

public class MainApplication {
	public static void main(String[] arg) {
		// JSONParser jsonparser = new JSONParser();
		// try {
		/// FileReader reader = new
		// FileReader("D:/InventoryManagement1/src/main/java/com/inventorymanagement/InventoryManagement1/example.json");
		// } catch (FileNotFoundException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		JSONObject rice = new JSONObject();
		rice.put("Name", "Rice");
		rice.put("Weight", 10);
		rice.put("Price", 100);
		JSONObject riceobject = new JSONObject();
		riceobject.put("food", rice);

		JSONObject wheat = new JSONObject();
		wheat.put("Name", "Wheat");
		wheat.put("Weight", 20);
		wheat.put("Price", 200);
		JSONObject wheatobject = new JSONObject();
		wheatobject.put("food", wheat);

		JSONObject pulse = new JSONObject();
		pulse.put("Name", "Pulse");
		pulse.put("Weight", 30);
		pulse.put("Price", 300);
		JSONObject pulseobject = new JSONObject();
		pulseobject.put("food", pulse);

	//	ArrayList foodstocklist = new ArrayList();
		JSONArray foodstocklist= new JSONArray();
		foodstocklist.add(riceobject);
		foodstocklist.add(wheatobject);
		foodstocklist.add(pulseobject);
		try {
			FileWriter file = new FileWriter(
					"D:/InventoryManagement1/src/main/java/com/inventorymanagement/InventoryManagement1/foodinventory.json");
			file.write(foodstocklist.toJSONString());
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print(foodstocklist);
	}
}
