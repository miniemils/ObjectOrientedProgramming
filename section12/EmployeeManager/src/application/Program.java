package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employess will be registered? ");
		int n = sc.nextInt();
		System.out.println("");
		
		for(int i=0; i<n; i++) {
			System.out.printf("Employee #%s\n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
				while(hasId(list, id)) {
					System.out.print("Id already taken! Try again: ");
					id = sc.nextInt();
				}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
			System.out.println("");
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalaryIncrease = sc.nextInt();		
		while(!hasId(list, idSalaryIncrease)) {
			System.out.println("This id does not exist! Try again: ");
			idSalaryIncrease = sc.nextInt();
		}
		
		Employee emp = null;
		for(Employee x : list) {
			if(x.getId() == idSalaryIncrease) {
				emp = x;
				break;
			}
		}

		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("");
		System.out.println("List of employees:");
		for(Employee x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = null;
		for(Employee x : list) {
			if(x.getId() == id) {
				emp = x;
				break;
			}
		}
		return emp != null;
	}

}