package application;

import java.util.Scanner;

import entities.RoomRent;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms are you renting? ");
		RoomRent[] rents = new RoomRent[10];

		int amount = sc.nextInt();

		for (int i = 0; i < amount; i++) {
			System.out.println();
			System.out.println("Rent # " + (i + 1));

			System.out.print("Name: ");
			String name = sc.next();

			System.out.print("Email: ");
			String email = sc.next();

			System.out.print("Room: ");
			int room = sc.nextInt();

			rents[room] = new RoomRent(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");

		for (int i = 0; i < 10; i++) {
			if (rents[i] != null) {
				System.out.println(i + ": " + rents[i]);
			}
			;
		}

		sc.close();
	}

}
