package com.demo.practice;
import java.util.Scanner;
class Products{
	String productName;
	int productId;
	double price;
	public Products(String productName,int productId,double price) {
		this.productName=productName;
		this.productId=productId;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("product details:");
		System.out.println("product name:"+productName);
		System.out.println("product ID:"+productId);
		System.out.println("price:"+price);
	}
}


public class Product {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the product name:");
		String productName=sc.nextLine();
		System.out.println("enter product id:");
		int productId=sc.nextInt();
		System.out.println("enter the price:");
		double price=sc.nextDouble();
		Products myProduct=new Products(productName,productId,price);
		myProduct.displayDetails();
		sc.close();
		
	}

}
