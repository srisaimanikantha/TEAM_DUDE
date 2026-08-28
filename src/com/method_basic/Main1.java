package com.method_basic;
import java.util.Scanner;

class Product {

    String productName;
    int productId;
    double price;

    Product(String productName, int productId, double price) {

        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }

    void display() {

        System.out.println("Product Details");
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
    }
}

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter product ID: ");
        int productId = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Product p = new Product(productName, productId, price);
        p.display();

    }
}
