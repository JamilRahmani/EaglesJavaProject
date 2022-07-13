package CollectionPractice;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, String> data = new HashMap<String, String>();

		// add items
		data.put("firstName", "Jack");
		data.put("lastName", "Ma");

		System.out.println(data);

		// returning values from your map
		System.out.println(data.get("firstName"));
		System.out.println(data.get("lastName"));

		// to loop through the map, you need to get the keySet and iterate though that
		System.out.println(data.keySet());
		for (String key : data.keySet()) {
			System.out.println(data.get(key));
		}

		// second map example
		System.out.println("---------------------------------------------------");
		HashMap<String, ArrayList<String>> temp = new HashMap<String, ArrayList<String>>();

		temp.put("firstNames", new ArrayList<String>());
		temp.put("lastNames", new ArrayList<String>());

		temp.get("firstNames").add("Jack");
		temp.get("firstNames").add("David");

		temp.get("lastNames").add("Ma");
		temp.get("lastNames").add("something");

		System.out.println(temp);

	}

}
