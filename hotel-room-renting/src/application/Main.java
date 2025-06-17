package application;

import java.util.Scanner;

import entities.RoomRent;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms are you renting? ");
		int amount = sc.nextInt();
		
		RoomRent[] rentings = new RoomRent[amount];
		
		for(int i = 0; i < amount; i++) {
			System.out.println("Rent # " + (i+1));
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rentings[i] = new RoomRent(name, email, room);
		}
		
		for(int i = 0; i < amount; i++) {
			System.out.println("Busy rooms: ");
			System.out.println(
					rentings[i].roomNumber + ", " + 
					rentings[i].name + ", " + 
					rentings[i].email);
			
		}
		
		sc.close();
	}

}
