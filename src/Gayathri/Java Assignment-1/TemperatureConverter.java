package com.demo.practice;
import java.util.Scanner;

public class TemperatureConverter {
	public static double convertToFahrenheit(double cel) {
		return (cel*9/5)+32;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature:");
		double cel=sc.nextDouble();
		double fahrenheit=convertToFahrenheit(cel);
		System.out.println("temp in fahrenheit:"+fahrenheit);
		sc.close();

	}

}
