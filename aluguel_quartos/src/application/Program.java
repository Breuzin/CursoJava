package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rooms[] vect = new Rooms[10];
		
		System.out.println("Quantos estudantes vão alugar quartos? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d", i + 1);
			System.out.println();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room (1 to 10): ");
			int number = sc.nextInt();
			
			vect[number] = new Rooms(name, email, number);
			System.out.println();
		}
		
		System.out.println("Busy Rooms: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
