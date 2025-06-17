package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Main {
	public static void main(String [] args) {
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Name:");
		employee.name = sc.next();
		
		System.out.print("Salary:");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax:");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
		
		System.out.println("Which percentage to increase salary?");
		double increasement = sc.nextDouble();
		employee.increaseSalary(increasement);
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
		
		sc.close();
	}
}
		