package entities;

public class Employee {
	
	public String name;
	public double salary;
	public double tax;
	
	public double netSalary() {
		return salary - tax;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0; 
	}
	
	@Override
	public String toString() {
		return name + ", $ " + String.format("%.3f", netSalary());
	}

}