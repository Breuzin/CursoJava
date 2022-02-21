package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Fridge", 3000.00));
		list.add(new Product("Tv", 800.00));
		list.add(new Product("Iphone", 4000.00));
		list.add(new Product("Mouse", 40.00));
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
