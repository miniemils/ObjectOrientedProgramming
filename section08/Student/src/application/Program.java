package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f", student.finalGrade());
		System.out.println();
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points.", student.missingPoints());
		}
		else {
			System.out.println("PASSED");
		}
		
		sc.close();

	}

}