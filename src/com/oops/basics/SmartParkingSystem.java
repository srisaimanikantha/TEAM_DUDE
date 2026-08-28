package com.oops.basics;
import java.util.Scanner;

public class SmartParkingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vehicle Type:");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Electric Car");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Registration Number:");
        String registrationNumber = sc.nextLine();

        System.out.println("Enter Owner Name:");
        String ownerName = sc.nextLine();

        System.out.println("Enter Parking Duration:");
        int parkingDuration = sc.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Bike(
                    registrationNumber,
                    ownerName,
                    parkingDuration
            );
        } 
        else if (choice == 2) {
            vehicle = new Car(
                    registrationNumber,
                    ownerName,
                    parkingDuration
            );
        } 
        else if (choice == 3) {
            vehicle = new ElectricCar(
                    registrationNumber,
                    ownerName,
                    parkingDuration
            );
        } 
        else {
            System.out.println("Invalid Vehicle Type");
            sc.close();
            return;
        }

        System.out.println("\n----- VEHICLE DETAILS -----");

        vehicle.displayDetails();

        vehicle.getParkingSlot();

        System.out.println("Normal Parking Fee: ₹"
                + vehicle.calculateFee());

        System.out.println("Is it Weekend? (true/false)");
        boolean weekend = sc.nextBoolean();

        System.out.println("Parking Fee: ₹"
                + vehicle.calculateFee(weekend));

    }
}