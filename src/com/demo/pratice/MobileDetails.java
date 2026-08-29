package com.demo.pratice;
import java.util.Scanner;

class Mobile{
	String brand;
	String model;
	String storage;
	
	Mobile(String brand, String model, String storage){
		this.brand = brand;
		this.model = model;
		this.storage = storage;
	}
	
	public void display() {
		System.out.println("Mobile Details: ");
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Stroage: "+storage+ "GB");
	}
}

public class MobileDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brand name: ");
		String brand = sc.nextLine();
		System.out.println("Enter the model name: ");
		String model = sc.nextLine();
		System.out.println("Enter the storage name: ");
		String storage = sc.nextLine();
		
		Mobile mobile = new Mobile(brand, model, storage);
		mobile.display();
		sc.close();

	}

}
