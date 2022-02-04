import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dolarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.quantDolar = sc.nextDouble();
		
		System.out.printf("Amount to paid in reais = %.2f%n", CurrencyConverter.paidAmount());
		
		sc.close();
	}

}
