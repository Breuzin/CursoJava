package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Item;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Item> list = new ArrayList<>();
		
		System.out.println("Enter with a path to file: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		
		boolean success = new File(sourceFile.getParent() + "\\out").mkdir();
		
		String targetFileStr = sourceFile.getParent() + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
			String line;
			while ((line = br.readLine()) != null) {
				
				String[] fields = line.split(";");
				String name = fields[0];
				double price = Double.valueOf(fields[1]);
				int quantity = Integer.valueOf(fields[2]);
				list.add(new Item(name, price, quantity));
			}	
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (Item i : list) {
					bw.write(i.getName() + ";" + String.format("%.2f", i.totalValue()));
					bw.newLine();
				}
				System.out.println(targetFileStr + " Target file created! ");
			}
			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}
		catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		
		
		sc.close();
	}

}
