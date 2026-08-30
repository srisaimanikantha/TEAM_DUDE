package com.demo.practice;
import java.util.Scanner;

public class AreaOfCircle {
	public static double calculateArea(double radius) {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		double radius=sc.nextDouble();
		double area=calculateArea(radius);
		System.out.println("area of a circle:"+area);
		sc.close();

	}

}
