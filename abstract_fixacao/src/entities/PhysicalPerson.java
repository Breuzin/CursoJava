package entities;

public class PhysicalPerson extends TaxPayer{

	private double healthSpend;

	public PhysicalPerson() {
	}
	
	public PhysicalPerson(String name, Double anualIncome, double healthSpend) {
		super(name, anualIncome);
		this.healthSpend = healthSpend;
	}

	public double getHealthSpend() {
		return healthSpend;
	}
	public void setHealthSpend(double healthSpend) {
		this.healthSpend = healthSpend;
	}

	@Override
	public double tax() {
		double tax;
		if (anualIncome < 20000) {
			tax = anualIncome * 0.15;
		} else tax = anualIncome * 0.25;
		
		if (healthSpend > 0) {
			tax = tax - healthSpend * 0.5;
		}
		return tax;
	}
	
	
	
	
	
}
