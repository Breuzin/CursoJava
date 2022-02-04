package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		Product[] product = new Product[n];
		
		for (int i = 0; i < product.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			product[i] = new Product(name, price);
		}
		
		double sum = 0;
		for (int i = 0; i < product.length; i++) {
			sum += product[i].getPrice();
		}
		
		double avg = sum / product.length;
		
		System.out.printf("Average: %.2f%n", avg);	
		
		
		
		sc.close();
		
	}

}
