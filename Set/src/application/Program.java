package application;

import java.util.stream.IntStream;

public class Program {

	public static void main(String[] args) {
	
		int um = " ".length();
		int cem = (int)'d';	
	
		IntStream.rangeClosed(um, cem).forEach(System.out::println);
		
	
	}
	
 
}