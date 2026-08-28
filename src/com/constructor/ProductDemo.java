package com.constructor;

import java.util.Scanner;

class product{
	String name;
	int productid;
	int price;
	public product(String name, int productid, int price) {
		super();
		this.name = name;
		this.productid = productid;
		this.price = price;
	}
	public void details() {
		System.out.println("Product Details");
		System.out.println("Product Name: "+this.name);
		System.out.println("Product ID: "+this.productid);
		System.out.println("Price: "+this.price);
	}
}

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product name:");
		String nm=sc.nextLine();
		System.out.println("Enter the product id:");
		int id=sc.nextInt();
		System.out.println("Enter the price");
		int price=sc.nextInt();
		
		product p=new product(nm,id,price);
		p.details();
		

	}

}
