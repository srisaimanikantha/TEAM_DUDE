package com.demo.practice;
import java.util.*;
class Bill{
	void printBill(String name) {
		System.out.println("Product: " + name);
	}
	void printBill(String name,int quantity) {
		System.out.println("Product: " + name +" , Quantity: "+quantity);
	}
	void printBill(String name, int quantity,int price) {
		System.out.println("Product: " + name +" , Quantity: "+quantity + ", Price: " + price);
	}
}

public class ShoppingBill {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the product name: ");
		String name=sc.nextLine();
		System.out.print("ENter the Quantity: ");
		int quantity=sc.nextInt();
		System.out.print("Enter the price: ");
		int price=sc.nextInt();
		
		Bill b=new Bill();
		b.printBill(name);
		b.printBill(name, quantity);
		b.printBill(name, quantity, price);

	}

}
