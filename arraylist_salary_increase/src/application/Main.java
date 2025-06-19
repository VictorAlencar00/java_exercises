package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("#" + (i+1) + " employee:");
			System.out.print("Id:");
			int id = sc.nextInt();
			while(idTaken(employees, id)) {
				System.out.println("ID already taken, choose another one: ");
				 id = sc.nextInt();
			}

			System.out.print("Name:");
			String name = sc.next();

			System.out.print("Salary:");
			double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);
			employees.add(employee);
			System.out.println();
		}

		System.out.print("Chose the employee ID to increase the salary: ");
		int chosen = sc.nextInt();
		
		while(!idTaken(employees, chosen)) {
			System.out.print("Employee ID doesn't match, try again: ");
			chosen = sc.nextInt();
		}

		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		employees.get(position(employees, chosen)).increaseSalary(percentage);

		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i) != null) {
				System.out.println(employees.get(i));
			}
		}

		sc.close();

}
	public static boolean idTaken(List<Employee> employees, int id) {
		Employee employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employee != null;

	}
	
	public static Integer position(List<Employee> employees, int id) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	};

}
