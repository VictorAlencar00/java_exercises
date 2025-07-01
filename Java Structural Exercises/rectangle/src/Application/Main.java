package Application;

import java.util.Scanner;

import Entities.Rectangle;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Rectangle's width and height:");
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle.Area());
		System.out.println(rectangle.Perimeter());
		System.out.println(rectangle.Diagonal());

		
		sc.close();
	}
}
