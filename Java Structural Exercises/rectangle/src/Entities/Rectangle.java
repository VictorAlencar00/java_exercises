package Entities;

public class Rectangle {
	public double width, height;
	
	public double Area() {
		double area = width * height;
		System.out.println("Area: " + area);
		return area;
		
	}
	
	public double Perimeter() {
		double perimeter = (width * 2) + (height * 2);
		System.out.println("Perimetro: " + perimeter);
		return perimeter;
	}
	
	public double Diagonal() {
		double diagonal = Math.sqrt(Math.pow(height, 2)+ Math.pow(width, 2));
		System.out.println("Diagonal: " + diagonal);
		return diagonal;
	}
	
}
