package entities;

public class Account {
	
	private int number;
	private String name;
	private double money;
	
	public Account(int number, String name, double inicDep) {
		this.number = number;
		this.name = name;
		deposit(inicDep);
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}
 
	public void deposit(double value) {
		this.money += value;
	}
	
	public void withdraw(double value) {
		this.money = this.money - value - 5.00;
	}
	
	public String toString() {
		return "Account " + this.number + ", Holder: " + this.name + ", Balance: $ " + String.format("%.2f%n", this.money);
	}
}
