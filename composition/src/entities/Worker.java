package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department department;

	// n�o incluir composi��o "tem-muitos" no construtor.
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) { // renda
		double sum = baseSalary; // variavel soma recebendo o sal�rio base
		Calendar cal = Calendar.getInstance(); // atrigui��o de calend�rio para valida��o do contrato no m�s e ano
												// apropriado
		for (HourContract c : contracts) { // leitura da lista de contratos para achar um contrato com a data correta
			cal.setTime(c.getDate()); // atribui��o do calendario para o contrato
			int c_year = cal.get(Calendar.YEAR); // atribui��o de uma vari�vel com o ano do contrato
			int c_month = 1 + cal.get(Calendar.MONTH); // atribui��o de uma vari�vel com o m�s do contrato
			if (year == c_year && month == c_month) { // condi��o para realizar a soma
				sum += c.totalValue(); // se o m�s do contrato e o ano forem correspondentes -->
			} // aos digitados pelo usu�rio, o contrato ser� incrementado na renda total
		}
		return sum;
	}
	
	public String toString() {
		return String.format("Name: %s\nDesign: %s\n", this.name, this.getDepartment().getName()); 
		
	}
}
