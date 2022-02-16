package model.entities;

public class Item {

	private String name;
	private double value;
	private int quantity;
	
	public Item() {
	}

	public Item(String name, double value, int quantity) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}
	
	public int getQuantity() {
		return quantity;
	}
	 
	public double totalValue() {
		return value * quantity;
	}
	
	
}
