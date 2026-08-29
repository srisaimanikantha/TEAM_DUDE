package com.demo.practice;

import java.util.Scanner;

class Laptop{
	String brand;
	int Ram;
	int storage;
	public Laptop(String brand) {
		super();
		this.brand = brand;
	}
	public Laptop(String brand, int Ram) {
		this.brand=brand;
		this.Ram=Ram;
	}
	public Laptop(String brand, int Ram,int storage) {
		this.brand=brand;
		this.Ram=Ram;
		this.storage=storage;
	}
	void display() {
		System.out.println("Brand: " + this.brand);
		if(Ram>0) {
		
		System.out.println("RAM: " + this.Ram +" GB" );
		}
		if(storage>0) {
			System.out.println("Storage: "+this.storage +" GB");
		}
		System.out.println();
		
	}
	
	
	
}

public class LaptopCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter brand:");
		String brand=sc.nextLine();

		System.out.print("Enter RAM:");
		int Ram=sc.nextInt();

		System.out.print("Enter Storage:");
		int storage=sc.nextInt();
		
		Laptop l=new Laptop(brand);
		Laptop l2=new Laptop(brand, storage);
		Laptop l3=new Laptop(brand, storage, storage);
		
		l.display();
		l2.display();
		l3.display();
		
		
		

	}

}
