package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.Paypal;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date: ");
		sc.nextLine();
		Date date =  sdf1.parse(sc.nextLine());
		System.out.print("Contract Value: ");
		double totalValue = sc.nextDouble();
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Enter the number of installments: ");
		int months = sc.nextInt();
		ContractService cs = new ContractService(new Paypal());
		cs.processContract(contract, months);
		
		System.out.println("Installments: ");
		for (Installment i : contract.getInstallments()) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
