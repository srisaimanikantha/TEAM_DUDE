package com.method_basic;
import java.util.*;
class Book{
	String name;
	String author;
	Double price;
	
	Book(String name, String author, Double price){
		this.name=name;
		this.author=author;
		this.price=price;
	}
	void display() {
		System.out.println("Book Details");
		System.out.println("Title: "+name);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book title: ");
		String s = sc.nextLine();
		System.out.println("Enter the author: ");
		String a = sc.nextLine();
		System.out.println("Enter the price: ");
		Double p=sc.nextDouble();
		Book b=new Book(s, a, p);
		b.display();
		
		// TODO Auto-generated method stub

	}

}
