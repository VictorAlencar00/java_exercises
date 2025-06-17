package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers are you typing?");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i=0; i<n; i++) {
			System.out.print("Type a number: ");
			int number = sc.nextInt();
			array[i] = number;
		};
		System.out.println("Negative numbers: ");
		for (int i=0; i<n; i++) {

			if (array[i] < 0) {
				System.out.println(array[i]);
			}
		};
		sc.close();
		
	}
}
