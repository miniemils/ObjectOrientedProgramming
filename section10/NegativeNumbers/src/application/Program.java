package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the quantity of numbers: ");
		int quantity = sc.nextInt();
		
		int[] vect = new int[quantity];
		
		for (int i=0; i<quantity; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Negative numbers:");
		for (int i=0; i<quantity; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();	
	}

}