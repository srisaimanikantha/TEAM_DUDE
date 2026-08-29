package com.demo.pratice;
import java.util.Scanner;

public class AreaCircle {
	
	public static double area(double radius) {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = sc.nextDouble();
		double result = area(radius);
		System.out.println("Area of circle: "+result);
		sc.close();

	}

}
