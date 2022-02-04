package source;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee employer =  new Employee();
		
		System.out.print("Name: ");
		employer.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employer.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employer.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + employer);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employer.increaseSalary(percentage);
		System.out.println();
		
		System.out.println("Updated data: " + employer);
		sc.close();
		
	}

}
