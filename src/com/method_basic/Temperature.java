package com.method_basic;
import java.util.*;

class celsius{
	void calculation(int celsius){
		double fahrenheit = (celsius * 9/5)+32;
		System.out.println("Temperature in Fahrenheit: "+fahrenheit);
		
	}
}
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in celsius: ");
		int celsius = sc.nextInt();
		celsius c = new celsius();
		c.calculation(celsius);
		sc.close();
		

	}

}
