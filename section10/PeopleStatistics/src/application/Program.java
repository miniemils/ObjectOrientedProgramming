package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		double[] heights = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Data of the %dst person:\n", i+1);
			System.out.print("Name: ");
			names[i] = sc.next();
			System.out.print("Age: ");
			ages[i] = sc.nextInt();
			System.out.print("Height: ");
			heights[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += heights[i];
		}
		double avg = sum/n;
		System.out.println();
		System.out.print("Average height: " + String.format("%.2f", avg));
		
		int count = 0;
		for(int i=0; i<n; i++) {
			if(ages[i] < 16)
				count++;
		}
		double total = count * 100 / n;
		System.out.println();
		System.out.println("People under 16 years: " + String.format("%.2f", total)+"%");
		for(int i=0; i<n; i++) {
			if(ages[i] < 16)
				System.out.println(names[i]);
		}
		
		sc.close();
	}

}