package entities;

import static util.Dates.formatDate;

import java.util.Date;

public final class UsedProduct extends Product{

	protected Date manufactureDate;
	
	public UsedProduct() {
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public final String priceTag() {
		 return String.format("%s (used) $ %.2f (Manufacture date: %s",this.name, this.price, formatDate(this.manufactureDate));
	}
}
