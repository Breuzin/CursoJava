package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		String path = "c:\\temp\\in.txt";
		
		List<Product> list = new ArrayList<>();
		
		try (BufferedReader br =  new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
			}
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Most expensive: ");
		System.out.println(CalculationService.max(list));
	}

}
