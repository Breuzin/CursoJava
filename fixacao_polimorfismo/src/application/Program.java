package application;

import static util.Dates.parseDate;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			char state = ' ';
			while (true) {
				System.out.print("Common, used or imported? (c/u/i) ");
				state = sc.next().charAt(0);
				if ("cui".contains(state + "")) {
					break;
				}
				System.out.println("Invalid type of product, please try again: ");
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (state == 'i') {
				System.out.print("Customs fee: ");
				double customs = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customs));
			} else if (state == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String manufactureDate = sc.nextLine();
				products.add(new UsedProduct(name, price, parseDate(manufactureDate)));
			} else {
				products.add(new Product(name, price));
			}
		}
		System.out.println("PRICE TAGS: ");
		products.stream().map(p -> p.priceTag()).forEach(System.out::println);
		sc.close();
	}

}
