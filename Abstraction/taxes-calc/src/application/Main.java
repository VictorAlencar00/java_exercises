package application;

import entities.Corporative;
import entities.Contributor;
import entities.Private;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contributor> contributorList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            while (type != 'i' && type != 'c') {
                System.out.print("Invalid option. Please enter 'i' or 'c': ");
                type = sc.next().charAt(0);
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double income = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                contributorList.add(new Private(name, income, health));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                contributorList.add(new Corporative(name, income, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double totalTaxes = 0.0;

        for (Contributor c : contributorList) {
            c.calcTaxes();
            double tax = c.getTaxes();
            System.out.printf("%s: $ %.2f%n", c.getName(), tax);
            totalTaxes += tax;
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", totalTaxes);

        sc.close();
    }
}