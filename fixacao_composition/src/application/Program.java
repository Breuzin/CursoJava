package application;

import static commons.DateUtils.parseDate;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter client data: ");
		System.out.print("   Name: ");
		String name = sc.nextLine();
		System.out.print("   Email: ");
		String email = sc.nextLine();
		System.out.print("   Birth Date: ");
		Date birthDate = parseDate(sc.next());
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.print("   Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		//Date orderDate = new Date();
		Order order = new Order(new Date(),OrderStatus.valueOf(status), client);
		
		System.out.print("   How many intems to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("   Enter #" + i + " item data:");
			System.out.print("      Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("      Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("      Quantity: ");
			int quantity = sc.nextInt();
			OrderItem item = new OrderItem(quantity, new Product(productName, productPrice));
			order.addItem(item);
		}
		
		System.out.println(order);
		
		sc.close();
	}

}
