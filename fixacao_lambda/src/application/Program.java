package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.print("File Path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line;
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
			}
			
			System.out.print("Enter with salary for filter: ");
			double filterSalary = sc.nextDouble();
			
			List<String> filteredList = list.stream()
					.filter(x -> x.getSalary() >= filterSalary)
					.map(x -> x.getEmail())
					.sorted()
					.toList();
			System.out.println("Email of people whose salary is more than: " + String.format("%.2f", filterSalary));
			filteredList.forEach(System.out::println);
			
			double sumSalary = list.stream()
					.filter(x -> x.getName().toUpperCase().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("The sum of salary from people whose name starts with 'M': "
					+ String.format("%.2f", sumSalary));
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
