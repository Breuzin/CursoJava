package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.println("Enter the number of tax players: ");
		int n =  sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			sc.nextLine();
			char type = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name  =  sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpend = sc.nextDouble();
				taxPayers.add(new PhysicalPerson(name, anualIncome, healthSpend));
			} else if (type == 'c') {
				System.out.print("Number of employees: ");
				int functionaryNumber = sc.nextInt();
				taxPayers.add(new LegalPerson(name, anualIncome, functionaryNumber));
			}
		}
		
		System.out.println("TAXES PAID:");
		double sum = 0;
		for (TaxPayer p : taxPayers) {
			System.out.println(p.getName() + String.format(" $ %.2f", p.tax()));
			sum += p.tax();
		}
		
		System.out.printf("TOTAL TAXES: %.2f", sum);
		
		sc.close();
				
	}

}
