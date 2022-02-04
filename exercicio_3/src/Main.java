import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);


		String name = sc.nextLine();
		double grade_1 = sc.nextDouble();
		double grade_2 = sc.nextDouble();
		double grade_3 = sc.nextDouble();

		//Implementação de contrutor para melhoria do programa 
		
		Student student = new Student(name, grade_1, grade_2, grade_3);
		
		System.out.println();
		System.out.printf("Final Grade = %.2f%n", student.sumGrades());

		if (student.verifyPass() == 0.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points%n", student.verifyPass());
		}

		sc.close();
	}

}
