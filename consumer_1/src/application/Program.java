package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		// Consumer: functional interface with type
		// generic <T>, where have an unique method
		// accept().

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 1000.00));
		list.add(new Product("Phone", 900.00));
		list.add(new Product("HeadSet", 300.00));
		list.add(new Product("Computer", 3000.00));
		
		list.forEach(p -> p.nonStaticPriceUpdate(p));
		
		list.forEach(System.out::println);
	}

}
