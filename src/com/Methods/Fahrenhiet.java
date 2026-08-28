package com.Methods;
import java.util.*;
public class Fahrenhiet {
	static double fahr(double cel) {
	return (cel *9/5)+32;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
		 int cel=sc.nextInt();
		double fahre=fahr(cel);
		System.out.println("Temperature in Fahrenheit: "+fahre);
		
	}

}
