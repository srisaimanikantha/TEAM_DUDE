package com.demo.pratice;
import java.util.Scanner;

public class Temperature {
	public static void convert(double celcius) {
		double fahrenheit = (celcius * 9/5) + 32;
		System.out.println("Temparature in Farhenheit: "+fahrenheit);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celcius: ");
		double celcius = sc.nextDouble();
		convert(celcius);
		sc.close();
	}

}
