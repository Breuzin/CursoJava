package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //para ler uma variável tipo data
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valeu per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			worker.addContract(new HourContract(contractDate, valuePerHour, hours));
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		Date incomeDate = sdf2.parse(sc.next());
		Calendar cal = Calendar.getInstance();
		cal.setTime(incomeDate);
		int calMonth = 1 + cal.get(Calendar.MONTH);
		int calYear = cal.get(Calendar.YEAR);
		System.out.print(worker);
		System.out.printf("Income for %s: %.2f", sdf2.format(incomeDate), worker.income(calYear, calMonth));
		
		
		
		
		
				
				
		sc.close();		
	}

}
