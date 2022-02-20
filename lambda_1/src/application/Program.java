package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 1000.00));
		list.add(new Product("Phone", 900.00));
		list.add(new Product("HeadSet", 300.00));
		list.add(new Product("Computer", 3000.00));
		
		list.removeIf(p -> p.getPrice() < 3000.00);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
