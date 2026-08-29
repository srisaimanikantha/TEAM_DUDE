package com.method_basic;

import java.util.*;

class Mobile {

    String brand;
    String model;
    int storage;

    Mobile(String brand, String model, int storage) {

        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    void display() {

        System.out.println("Mobile Details");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter storage: ");
        int storage = sc.nextInt();

        Mobile m = new Mobile(brand, model, storage);

        m.display();
    }
}