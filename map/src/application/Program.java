package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Map<K, V> map = new HashMap<K, V>();

		// map.put(key, value);
		// map.remove(key);
		// map.containsKey(key);
		// map.get(key);

		// map.clear();
		// map.size();

		// keySet() - returns a Set<K>
		// values() - returns a Collection<V>

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "maria");
		cookies.put("email", "guimine.20@gmail.com");
		cookies.put("phone", "986029601");

		System.out.println("All cookies: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		System.out.println();
		cookies.remove("email");
		System.out.println("Remove cookies: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		System.out.println();
		cookies.put("phone", "194935493");
		System.out.println("Override cookies: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		System.out.println();
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println();
		System.out.println("Get 'email' key: " + cookies.get("email"));
		System.out.println();
		/////////
		/////////
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}

}
