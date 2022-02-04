import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Source {

	public static void main(String[] args) {

		double money = 0;
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter with account number: ");
		int number = sc.nextInt();
		System.out.print("Enter with account name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Will you make your first deposit? (y/n) ");
		char makeDeposit = sc.next().charAt(0);
		System.out.println();
		

		if (makeDeposit == 'y') {
			System.out.print("Enter with the value: ");
			money = sc.nextDouble();	
		} 
		
		Account account = new Account(number,name,money);
		System.out.println("Account data: ");
		System.out.println(account);
		
		//Account account = new Account(number, name, money);
		
		System.out.print("Enter a deposit value: ");
		money = sc.nextDouble();
		account.deposit(money);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		money = sc.nextDouble();
		account.withdraw(money);
		System.out.println("Updated Account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
