package entities;

public class CurrencyConverter {

	public double dollarPrice;
	public double quantity;

	public double getPaid() {
		double calc = dollarPrice * quantity;
		double iof = calc * 0.06;
		return calc + iof;
	}
	
}