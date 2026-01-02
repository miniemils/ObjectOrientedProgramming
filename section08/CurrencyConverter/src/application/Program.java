package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cc.dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		cc.quantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f", cc.getPaid());
		
		sc.close();
	}

}