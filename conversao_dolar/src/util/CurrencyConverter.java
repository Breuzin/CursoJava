package util;

public class CurrencyConverter {

	public static double dolarPrice;
	public static double quantDolar;
	public final static double IOF = 0.06;
	
	public static double paidAmount() {
		return ((dolarPrice * IOF) + dolarPrice) * quantDolar;
	}
}
