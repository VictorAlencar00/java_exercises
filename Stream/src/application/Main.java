package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

            String line = bf.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                Employee employee = new Employee(fields[0],fields[1], Double.parseDouble(fields[2]));
                employees.add(employee);
                line = bf.readLine();
            }
            System.out.println("Enter Salary: ");
            double chosenSalary = sc.nextDouble();

            List<String> emails = employees.stream()
                    .filter(employee -> employee.getSalary() >= chosenSalary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();
            System.out.println("Email of people with salary starting from " + chosenSalary + ":");
            emails.forEach(System.out::println);

            Double salarySum = employees.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary of the employees with a name that starts with 'M': " + salarySum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}