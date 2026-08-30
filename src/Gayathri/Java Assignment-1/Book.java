package com.demo.practice;
import java.util.Scanner;

class Books {
	String title;
	String author;
	double price;
	public Books(String title,String author,double price) {
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	public void displayDetails() {
		System.out.println("Book Details");
		System.out.println("title:"+title);
		System.out.println("author:"+author);
		System.out.println("price:"+price);
	}
}
public class Book{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book title:");
		String title=sc.nextLine();
		System.out.println("enter author of the book");
		String author=sc.nextLine();
		
		System.out.println("enter price:");
		double price=sc.nextDouble();
		Books myBook=new Books(title,author,price);
		myBook.displayDetails();
		sc.close();
		
		
	}
	
}


	