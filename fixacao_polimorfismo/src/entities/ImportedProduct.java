package entities;

public final class ImportedProduct extends Product {

	protected Double customFee;
	
	
	public ImportedProduct() {	
	}
	
	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}
	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	public double totalPrice() {
		return super.price + this.customFee;
	}
	
	@Override
	public final String priceTag() {
		 return String.format("%s $ %.2f (Customs fee : $ %.2f)",this.name, totalPrice(), this.customFee);
		
	}
}
