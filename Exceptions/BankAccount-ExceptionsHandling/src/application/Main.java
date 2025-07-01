package application;

import model.entities.BankAccount;
import model.exceptions.WithdrawException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            String holder = sc.next();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter initial withdraw limit: ");
            double withDrawLimit = sc.nextDouble();

            BankAccount account = new BankAccount(number, holder, balance, withDrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double withdrawValue = sc.nextDouble();
            account.withdraw(withdrawValue);

            System.out.print("New balance: " + account.getBalance());

        } catch (WithdrawException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}
