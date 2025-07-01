package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose the amount of columns:");
		int n = sc.nextInt();
		
		System.out.print("Choose the amount of lines:");
		int m = sc.nextInt();
		
		int[][] matrix = new int[m][n];
		
		  System.out.println("Type the matrix's values:");
		
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix finished.");
		System.out.print("Type a number to show their neighbours: ");
		int x = sc.nextInt();

		
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				if (x == matrix[i][j]) {
					System.out.println("\nPosition: " + i + ", " + j);
					if (i>0) {
						System.out.println("Top: " + matrix[i-1][j]);
					}
					if (j>0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if (j<m) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if (i<n) {
						System.out.println("Bottom: " + matrix[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
