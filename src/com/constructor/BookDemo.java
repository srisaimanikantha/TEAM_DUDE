package com.constructor;

import java.util.Scanner;

class Book {

    String booktitle;
    String authorname;
    int price;

    public Book() {
    }

    public Book(String booktitle, String authorname, int price) {
        this.booktitle = booktitle;
        this.authorname = authorname;
        this.price = price;
    }

    public void display() {
        System.out.println("Book Details");
        System.out.println("Title: " + this.booktitle);
        System.out.println("Author: " + this.authorname);
        System.out.println("Price: " + this.price);
    }
}

public class BookDemo {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the book title name: ");
    	String title=sc.nextLine();
    	System.out.println("Enter the author name:");
    	String author=sc.nextLine();
    	System.out.println("Enter the price:");
    	int price=sc.nextInt();
        Book b1 = new Book(title,author,price);

        b1.display();
    }
}

