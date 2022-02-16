package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = {"Good morning" , "Good night", "Good Job" };
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			bw.newLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
