package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		PrintService ps = new PrintService();
		
		for (int i = 0; i < n; i++) {
			ps.addValue(sc.nextInt());
		}
		ps.print();
		System.out.println("Frist: " + ps.first());
		
		sc.close();
	}

}
