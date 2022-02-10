package entities;

public class LegalPerson extends TaxPayer{
	
	private Integer functionaryNumber;
	
	public LegalPerson() {
	}

	public LegalPerson(String name, Double anualIncome, Integer functionaryNumber) {
		super(name, anualIncome);
		this.functionaryNumber = functionaryNumber;
	}

	public Integer getFunctionaryNumber() {
		return functionaryNumber;
	}
	public void setFunctionaryNumber(Integer functionaryNumber) {
		this.functionaryNumber = functionaryNumber;
	}

	@Override
	public double tax() {
		double tax;
		if (functionaryNumber > 10) {
			tax = anualIncome * 0.14;
		} else tax = anualIncome * 0.16;
		return tax;
	}
	
	

}
