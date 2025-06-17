package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {
	public static void main (String[] args) {
		BankAccount account;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String owner = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(owner, number, initialDeposit);
		} else {
			account = new BankAccount(owner, number);
		}
		
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.print("");
		
		System.out.println("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.print("");
		
		System.out.println("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		sc.close();
	}
	
}
