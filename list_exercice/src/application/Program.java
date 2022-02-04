package application;

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

		System.out.println("How many employees will be rehistered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ": ");
			System.out.println("Id: ");
			sc.nextLine();
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.println("This id already exist!");
				id = sc.nextInt();
			}

			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		double percentage = 0;

		System.out.println("Enter with id of the functionary that will be increased: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
		if (emp != null) {
			System.out.println("Enter with the percentage: ");
			percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		} else {
			System.out.println("This Id doesn't exist!");
		}

		System.out.println("List of Employees: ");
		for (Employee e : list) {
			System.out.println(e);
		}

		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
