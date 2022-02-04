package entities;

public class Student {

	public String name;
	public double grade_1;
	public double grade_2;
	public double grade_3;

	//Construtor para garantia de implementação de valores para variáveis
	
	public Student(String name, double grade_1, double grade_2, double grade_3) {
		this.name = name;
		this.grade_1 = grade_1;
		this.grade_2 = grade_2;
		this.grade_3 = grade_3;
	}

	public double sumGrades() {
		return grade_1 + grade_2 + grade_3;
	}

	public double verifyPass() {
		if (sumGrades() >= 60) {
			return 0.0;
		} else {
			return 60.0 - sumGrades();
		}

	}

}
