package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the quantity of numbers: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];

		double sum = 0.0;
		for(int i=0; i<n; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		System.out.print("Values = ");
		for(int i=0; i<n; i++) {
			System.out.print(vect[i] + " ");
		}
		
		System.out.println();
		System.out.print("SUM = " + sum);
		System.out.println();
		double avg = sum/n;
		System.out.print("AVERAGE = " + avg);
	
		sc.close();	
		
	}

}