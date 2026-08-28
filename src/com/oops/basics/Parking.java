package com.oops.basics;

abstract class Vehicle {

    String registrationNumber;
    String ownerName;
    int parkingDuration;

    Vehicle(String registrationNumber, String ownerName, int parkingDuration) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.parkingDuration = parkingDuration;
    }

    void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Parking Duration: " + parkingDuration + " hours");
    }
    abstract void getParkingSlot();

    abstract double calculateFee();

    double calculateFee(boolean weekend) {
        double fee = calculateFee();

        if (weekend) {
            fee = fee + (fee * 0.20);
        }

        return fee;
    }
}