package com.method_basic;
import java.util.*;
class Circle{
	void calucalate(double radius) {
		double area = 3.14*radius*radius;
		System.out.println("Area of circle: "+area);
	}
}
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = sc.nextDouble();
		Circle c = new Circle();
		c.calucalate(radius);
		sc.close();
		

	}

}
