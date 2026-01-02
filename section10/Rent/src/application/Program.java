package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("How many rooms will be rented? ");
			int n = sc.nextInt();
			if(n>=1 && n<=10) {
				Rent[] vect = new Rent[10];
			
				for(int i=1; i<=n; i++) {
					System.out.printf("Rent #%d:\n", i);
					System.out.print("Name: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.print("Email: ");
					String email = sc.next();
					System.out.print("Room: ");
					int roomNumber = sc.nextInt();
					
					Rent r = new Rent(name, email);
					
					vect[roomNumber] = r;
				}
				System.out.println();
				System.out.println("Busy rooms:");
				for(int i=1; i<10; i++) {
					if(vect[i] != null) {
						System.out.println(i + "" + vect[i]);
					}
				}
				break;
			}
			else {
				System.out.println("Invalid amount of students. Please, try again.");
			}
		}
		
		sc.close();
	}

}